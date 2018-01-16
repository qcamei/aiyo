package space.aiyo.util;

import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import space.aiyo.schedule.HeroSchedule;
import space.aiyo.schedule.ItemSchedule;
import space.aiyo.schedule.MatchSchedule;
import space.aiyo.component.RedisManager;
import space.aiyo.component.RocketMQManager;
import space.aiyo.data.HeroDBVerticle;
import space.aiyo.data.ItemDBVerticle;
import space.aiyo.data.MatchDBVerticle;
import space.aiyo.data.SteamCrawlerVerticle;

/**
 * CREATE BY Yo ON 2018/1/13 22:00
 */
public class DeployVerticleUtil {

    private static Logger logger = LoggerFactory.getLogger(DeployVerticleUtil.class);

    public static void deployVerticle(Vertx vertx) {
        ConfigStoreOptions store = new ConfigStoreOptions()
                .setType("file")
                .setFormat("yaml")
                .setConfig(new JsonObject()
                        .put("path", "config.yaml")
                );

        ConfigRetriever retriever = ConfigRetriever.create(vertx,
                new ConfigRetrieverOptions().addStore(store));

        retriever.getConfig(result -> {
            if (result.succeeded()) {
                //配置信息
                DeploymentOptions options = new DeploymentOptions().setConfig(result.result());

                //部署Verticle
                vertx.deployVerticle(RocketMQManager.class.getName(), res -> {
                    if (res.failed()) {
                        logger.error("deployVerticle RocketMQManager failed", result.cause());
                        vertx.close();
                    }
                });
                vertx.deployVerticle(RedisManager.class.getName(), options, res -> {
                    if (res.succeeded()) {
                        //业务Verticle
                        //schedule包
                        vertx.deployVerticle(HeroSchedule.class.getName());
                        vertx.deployVerticle(ItemSchedule.class.getName());
                        vertx.deployVerticle(MatchSchedule.class.getName());
                        //data包
                        vertx.deployVerticle(SteamCrawlerVerticle.class.getName(), options);
                        vertx.deployVerticle(HeroDBVerticle.class.getName(), options);
                        vertx.deployVerticle(ItemDBVerticle.class.getName(), options);
                        vertx.deployVerticle(MatchDBVerticle.class.getName(), options);
                    } else {
                        logger.error("deployVerticle RedisManager failed", result.cause());
                        vertx.close();
                    }
                });
            } else {
                logger.error("getConfig failed", result.cause());
                vertx.close();
            }
        });
    }
}
