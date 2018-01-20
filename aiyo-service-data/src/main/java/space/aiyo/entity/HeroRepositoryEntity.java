package space.aiyo.entity;

import entity.dota.HeroEntity;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * CREATE BY Yo ON 2018/1/20 11:52
 */
@Document(collection = "dotaHero")
public class HeroRepositoryEntity extends HeroEntity {

  @Id
  private ObjectId _id;

  public ObjectId get_id() {
    return _id;
  }

  public void set_id(ObjectId _id) {
    this._id = _id;
  }

  @Override
  public String toString() {
    return "HeroRepositoryEntity{" +
        "_id=" + _id +
        super.toString() +
        '}';
  }
}
