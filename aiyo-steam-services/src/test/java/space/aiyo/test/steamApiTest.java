package space.aiyo.test;

import org.junit.Test;
import space.aiyo.steam.util.HttpUtil;

import java.io.IOException;

/**
 * Created by yo on 2017/5/17.
 */
public class steamApiTest {

    @Test
    public void test() {
        String result;
        String urlStr = "http://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/v1?match_id=3184216260&key=B012552DE5DD0A220085EE8B21FBEC32";
        try {
            result = HttpUtil.sendGet(urlStr);
            System.out.print(result);
        } catch (IOException e) {

        }

    }
}

//{
//        "result": {
//        "players": [
//        {
//        "account_id": 344441990,
//        "player_slot": 0,
//        "hero_id": 72,
//        "item_0": 63,
//        "item_1": 156,
//        "item_2": 116,
//        "item_3": 108,
//        "item_4": 154,
//        "item_5": 158,
//        "backpack_0": 46,
//        "backpack_1": 65,
//        "backpack_2": 0,
//        "kills": 16,
//        "deaths": 7,
//        "assists": 26,
//        "leaver_status": 0,
//        "last_hits": 321,
//        "denies": 13,
//        "gold_per_min": 679,
//        "xp_per_min": 653,
//        "level": 25,
//        "hero_damage": 44727,
//        "tower_damage": 7008,
//        "hero_healing": 0,
//        "gold": 2735,
//        "gold_spent": 28695,
//        "scaled_hero_damage": 25061,
//        "scaled_tower_damage": 4816,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5651,
//        "time": 389,
//        "level": 1
//        },
//        {
//        "ability": 5257,
//        "time": 507,
//        "level": 2
//        },
//        {
//        "ability": 5651,
//        "time": 596,
//        "level": 3
//        },
//        {
//        "ability": 5257,
//        "time": 717,
//        "level": 4
//        },
//        {
//        "ability": 5651,
//        "time": 792,
//        "level": 5
//        },
//        {
//        "ability": 5067,
//        "time": 944,
//        "level": 6
//        },
//        {
//        "ability": 5651,
//        "time": 995,
//        "level": 7
//        },
//        {
//        "ability": 5257,
//        "time": 1047,
//        "level": 8
//        },
//        {
//        "ability": 5257,
//        "time": 1203,
//        "level": 9
//        },
//        {
//        "ability": 6405,
//        "time": 1271,
//        "level": 10
//        },
//        {
//        "ability": 5363,
//        "time": 1366,
//        "level": 11
//        },
//        {
//        "ability": 5067,
//        "time": 1489,
//        "level": 12
//        },
//        {
//        "ability": 5363,
//        "time": 1539,
//        "level": 13
//        },
//        {
//        "ability": 5363,
//        "time": 1550,
//        "level": 14
//        },
//        {
//        "ability": 5939,
//        "time": 1575,
//        "level": 15
//        },
//        {
//        "ability": 5363,
//        "time": 1667,
//        "level": 16
//        },
//        {
//        "ability": 5067,
//        "time": 1893,
//        "level": 17
//        },
//        {
//        "ability": 6077,
//        "time": 2165,
//        "level": 18
//        },
//        {
//        "ability": 6312,
//        "time": 2951,
//        "level": 19
//        }
//        ]
//        },
//        {
//        "account_id": 142016144,
//        "player_slot": 1,
//        "hero_id": 22,
//        "item_0": 90,
//        "item_1": 100,
//        "item_2": 226,
//        "item_3": 48,
//        "item_4": 235,
//        "item_5": 0,
//        "backpack_0": 0,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 12,
//        "deaths": 6,
//        "assists": 36,
//        "leaver_status": 0,
//        "last_hits": 164,
//        "denies": 0,
//        "gold_per_min": 425,
//        "xp_per_min": 641,
//        "level": 25,
//        "hero_damage": 35223,
//        "tower_damage": 2458,
//        "hero_healing": 0,
//        "gold": 591,
//        "gold_spent": 18965,
//        "scaled_hero_damage": 19622,
//        "scaled_tower_damage": 1823,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5549,
//        "time": 383,
//        "level": 1
//        },
//        {
//        "ability": 5112,
//        "time": 537,
//        "level": 2
//        },
//        {
//        "ability": 5549,
//        "time": 670,
//        "level": 3
//        },
//        {
//        "ability": 5550,
//        "time": 750,
//        "level": 4
//        },
//        {
//        "ability": 5549,
//        "time": 803,
//        "level": 5
//        },
//        {
//        "ability": 5113,
//        "time": 975,
//        "level": 6
//        },
//        {
//        "ability": 5551,
//        "time": 1096,
//        "level": 7
//        },
//        {
//        "ability": 5549,
//        "time": 1230,
//        "level": 8
//        },
//        {
//        "ability": 5550,
//        "time": 1408,
//        "level": 9
//        },
//        {
//        "ability": 5919,
//        "time": 1572,
//        "level": 10
//        },
//        {
//        "ability": 5112,
//        "time": 1665,
//        "level": 11
//        },
//        {
//        "ability": 5551,
//        "time": 1696,
//        "level": 12
//        },
//        {
//        "ability": 5550,
//        "time": 1837,
//        "level": 13
//        },
//        {
//        "ability": 5112,
//        "time": 1922,
//        "level": 14
//        },
//        {
//        "ability": 6138,
//        "time": 1989,
//        "level": 15
//        },
//        {
//        "ability": 5550,
//        "time": 1999,
//        "level": 16
//        },
//        {
//        "ability": 5551,
//        "time": 2245,
//        "level": 17
//        },
//        {
//        "ability": 5112,
//        "time": 2437,
//        "level": 18
//        },
//        {
//        "ability": 5113,
//        "time": 2989,
//        "level": 19
//        }
//        ]
//        },
//        {
//        "account_id": 176424673,
//        "player_slot": 2,
//        "hero_id": 40,
//        "item_0": 65,
//        "item_1": 116,
//        "item_2": 147,
//        "item_3": 29,
//        "item_4": 158,
//        "item_5": 263,
//        "backpack_0": 0,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 24,
//        "deaths": 11,
//        "assists": 21,
//        "leaver_status": 0,
//        "last_hits": 245,
//        "denies": 14,
//        "gold_per_min": 625,
//        "xp_per_min": 713,
//        "level": 25,
//        "hero_damage": 41659,
//        "tower_damage": 5193,
//        "hero_healing": 0,
//        "gold": 3101,
//        "gold_spent": 25645,
//        "scaled_hero_damage": 27578,
//        "scaled_tower_damage": 3501,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5179,
//        "time": 408,
//        "level": 1
//        },
//        {
//        "ability": 5228,
//        "time": 480,
//        "level": 2
//        },
//        {
//        "ability": 5179,
//        "time": 521,
//        "level": 3
//        },
//        {
//        "ability": 5228,
//        "time": 564,
//        "level": 4
//        },
//        {
//        "ability": 5179,
//        "time": 629,
//        "level": 5
//        },
//        {
//        "ability": 5181,
//        "time": 698,
//        "level": 6
//        },
//        {
//        "ability": 5228,
//        "time": 781,
//        "level": 7
//        },
//        {
//        "ability": 5179,
//        "time": 870,
//        "level": 8
//        },
//        {
//        "ability": 5180,
//        "time": 947,
//        "level": 9
//        },
//        {
//        "ability": 5180,
//        "time": 1040,
//        "level": 10
//        },
//        {
//        "ability": 6141,
//        "time": 1184,
//        "level": 11
//        },
//        {
//        "ability": 5181,
//        "time": 1271,
//        "level": 12
//        },
//        {
//        "ability": 5180,
//        "time": 1374,
//        "level": 13
//        },
//        {
//        "ability": 5180,
//        "time": 1546,
//        "level": 14
//        },
//        {
//        "ability": 5959,
//        "time": 1665,
//        "level": 15
//        },
//        {
//        "ability": 5228,
//        "time": 1838,
//        "level": 16
//        },
//        {
//        "ability": 5181,
//        "time": 1950,
//        "level": 17
//        },
//        {
//        "ability": 5942,
//        "time": 2048,
//        "level": 18
//        },
//        {
//        "ability": 6532,
//        "time": 2683,
//        "level": 19
//        }
//        ]
//        },
//        {
//        "account_id": 168342126,
//        "player_slot": 3,
//        "hero_id": 49,
//        "item_0": 65,
//        "item_1": 229,
//        "item_2": 232,
//        "item_3": 1,
//        "item_4": 220,
//        "item_5": 102,
//        "backpack_0": 0,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 5,
//        "deaths": 4,
//        "assists": 29,
//        "leaver_status": 0,
//        "last_hits": 118,
//        "denies": 8,
//        "gold_per_min": 449,
//        "xp_per_min": 644,
//        "level": 25,
//        "hero_damage": 11470,
//        "tower_damage": 562,
//        "hero_healing": 0,
//        "gold": 3370,
//        "gold_spent": 17875,
//        "scaled_hero_damage": 7280,
//        "scaled_tower_damage": 379,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5241,
//        "time": 327,
//        "level": 1
//        },
//        {
//        "ability": 5227,
//        "time": 521,
//        "level": 2
//        },
//        {
//        "ability": 5241,
//        "time": 631,
//        "level": 3
//        },
//        {
//        "ability": 5227,
//        "time": 761,
//        "level": 4
//        },
//        {
//        "ability": 5241,
//        "time": 822,
//        "level": 5
//        },
//        {
//        "ability": 5654,
//        "time": 906,
//        "level": 6
//        },
//        {
//        "ability": 5241,
//        "time": 1012,
//        "level": 7
//        },
//        {
//        "ability": 5255,
//        "time": 1127,
//        "level": 8
//        },
//        {
//        "ability": 5255,
//        "time": 1181,
//        "level": 9
//        },
//        {
//        "ability": 6137,
//        "time": 1281,
//        "level": 10
//        },
//        {
//        "ability": 5255,
//        "time": 1376,
//        "level": 11
//        },
//        {
//        "ability": 5255,
//        "time": 1520,
//        "level": 12
//        },
//        {
//        "ability": 5654,
//        "time": 1569,
//        "level": 13
//        },
//        {
//        "ability": 5227,
//        "time": 1781,
//        "level": 14
//        },
//        {
//        "ability": 6447,
//        "time": 1911,
//        "level": 15
//        },
//        {
//        "ability": 5227,
//        "time": 1999,
//        "level": 16
//        },
//        {
//        "ability": 5654,
//        "time": 2159,
//        "level": 17
//        },
//        {
//        "ability": 6008,
//        "time": 2342,
//        "level": 18
//        },
//        {
//        "ability": 6355,
//        "time": 2958,
//        "level": 19
//        }
//        ]
//        },
//        {
//        "account_id": 4294967295,
//        "player_slot": 4,
//        "hero_id": 26,
//        "item_0": 100,
//        "item_1": 174,
//        "item_2": 34,
//        "item_3": 48,
//        "item_4": 108,
//        "item_5": 232,
//        "backpack_0": 0,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 7,
//        "deaths": 9,
//        "assists": 14,
//        "leaver_status": 0,
//        "last_hits": 116,
//        "denies": 14,
//        "gold_per_min": 387,
//        "xp_per_min": 466,
//        "level": 22,
//        "hero_damage": 15043,
//        "tower_damage": 615,
//        "hero_healing": 0,
//        "gold": 902,
//        "gold_spent": 16580,
//        "scaled_hero_damage": 10962,
//        "scaled_tower_damage": 425,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5065,
//        "time": 364,
//        "level": 1
//        },
//        {
//        "ability": 5653,
//        "time": 482,
//        "level": 2
//        },
//        {
//        "ability": 5065,
//        "time": 569,
//        "level": 3
//        },
//        {
//        "ability": 5362,
//        "time": 712,
//        "level": 4
//        },
//        {
//        "ability": 5065,
//        "time": 816,
//        "level": 5
//        },
//        {
//        "ability": 5047,
//        "time": 911,
//        "level": 6
//        },
//        {
//        "ability": 5065,
//        "time": 995,
//        "level": 7
//        },
//        {
//        "ability": 5362,
//        "time": 1063,
//        "level": 8
//        },
//        {
//        "ability": 5362,
//        "time": 1174,
//        "level": 9
//        },
//        {
//        "ability": 5362,
//        "time": 1267,
//        "level": 10
//        },
//        {
//        "ability": 5947,
//        "time": 1388,
//        "level": 11
//        },
//        {
//        "ability": 5047,
//        "time": 1715,
//        "level": 12
//        },
//        {
//        "ability": 5653,
//        "time": 1760,
//        "level": 13
//        },
//        {
//        "ability": 5653,
//        "time": 1840,
//        "level": 14
//        },
//        {
//        "ability": 5653,
//        "time": 1858,
//        "level": 15
//        },
//        {
//        "ability": 6007,
//        "time": 2050,
//        "level": 16
//        },
//        {
//        "ability": 5047,
//        "time": 2376,
//        "level": 17
//        },
//        {
//        "ability": 5949,
//        "time": 2531,
//        "level": 18
//        }
//        ]
//        },
//        {
//        "account_id": 142133026,
//        "player_slot": 128,
//        "hero_id": 55,
//        "item_0": 90,
//        "item_1": 180,
//        "item_2": 79,
//        "item_3": 0,
//        "item_4": 125,
//        "item_5": 0,
//        "backpack_0": 0,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 3,
//        "deaths": 16,
//        "assists": 11,
//        "leaver_status": 0,
//        "last_hits": 86,
//        "denies": 0,
//        "gold_per_min": 271,
//        "xp_per_min": 364,
//        "level": 19,
//        "hero_damage": 8889,
//        "tower_damage": 0,
//        "hero_healing": 1500,
//        "gold": 1237,
//        "gold_spent": 10060,
//        "scaled_hero_damage": 6053,
//        "scaled_tower_damage": 0,
//        "scaled_hero_healing": 683,
//        "ability_upgrades": [
//        {
//        "ability": 5361,
//        "time": 392,
//        "level": 1
//        },
//        {
//        "ability": 5044,
//        "time": 511,
//        "level": 2
//        },
//        {
//        "ability": 5361,
//        "time": 603,
//        "level": 3
//        },
//        {
//        "ability": 5044,
//        "time": 691,
//        "level": 4
//        },
//        {
//        "ability": 5361,
//        "time": 801,
//        "level": 5
//        },
//        {
//        "ability": 5240,
//        "time": 951,
//        "level": 6
//        },
//        {
//        "ability": 5361,
//        "time": 1063,
//        "level": 7
//        },
//        {
//        "ability": 5044,
//        "time": 1135,
//        "level": 8
//        },
//        {
//        "ability": 5044,
//        "time": 1402,
//        "level": 9
//        },
//        {
//        "ability": 6003,
//        "time": 1606,
//        "level": 10
//        },
//        {
//        "ability": 5652,
//        "time": 1732,
//        "level": 11
//        },
//        {
//        "ability": 5240,
//        "time": 1946,
//        "level": 12
//        },
//        {
//        "ability": 5652,
//        "time": 1961,
//        "level": 13
//        },
//        {
//        "ability": 5652,
//        "time": 2118,
//        "level": 14
//        },
//        {
//        "ability": 5913,
//        "time": 2421,
//        "level": 15
//        },
//        {
//        "ability": 5652,
//        "time": 2423,
//        "level": 16
//        },
//        {
//        "ability": 5240,
//        "time": 2719,
//        "level": 17
//        }
//        ]
//        },
//        {
//        "account_id": 4294967295,
//        "player_slot": 129,
//        "hero_id": 99,
//        "item_0": 180,
//        "item_1": 127,
//        "item_2": 90,
//        "item_3": 108,
//        "item_4": 178,
//        "item_5": 36,
//        "backpack_0": 0,
//        "backpack_1": 46,
//        "backpack_2": 0,
//        "kills": 5,
//        "deaths": 11,
//        "assists": 9,
//        "leaver_status": 0,
//        "last_hits": 187,
//        "denies": 4,
//        "gold_per_min": 343,
//        "xp_per_min": 457,
//        "level": 22,
//        "hero_damage": 25358,
//        "tower_damage": 0,
//        "hero_healing": 0,
//        "gold": 407,
//        "gold_spent": 14410,
//        "scaled_hero_damage": 14577,
//        "scaled_tower_damage": 0,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5178,
//        "time": 392,
//        "level": 1
//        },
//        {
//        "ability": 5548,
//        "time": 473,
//        "level": 2
//        },
//        {
//        "ability": 5178,
//        "time": 528,
//        "level": 3
//        },
//        {
//        "ability": 5548,
//        "time": 572,
//        "level": 4
//        },
//        {
//        "ability": 5178,
//        "time": 647,
//        "level": 5
//        },
//        {
//        "ability": 5244,
//        "time": 774,
//        "level": 6
//        },
//        {
//        "ability": 5178,
//        "time": 918,
//        "level": 7
//        },
//        {
//        "ability": 5068,
//        "time": 1012,
//        "level": 8
//        },
//        {
//        "ability": 5548,
//        "time": 1064,
//        "level": 9
//        },
//        {
//        "ability": 5961,
//        "time": 1136,
//        "level": 10
//        },
//        {
//        "ability": 5068,
//        "time": 1285,
//        "level": 11
//        },
//        {
//        "ability": 5244,
//        "time": 1416,
//        "level": 12
//        },
//        {
//        "ability": 5068,
//        "time": 1605,
//        "level": 13
//        },
//        {
//        "ability": 5068,
//        "time": 1759,
//        "level": 14
//        },
//        {
//        "ability": 6405,
//        "time": 1956,
//        "level": 15
//        },
//        {
//        "ability": 5548,
//        "time": 2033,
//        "level": 16
//        },
//        {
//        "ability": 5244,
//        "time": 2271,
//        "level": 17
//        },
//        {
//        "ability": 6564,
//        "time": 2805,
//        "level": 18
//        }
//        ]
//        },
//        {
//        "account_id": 136214541,
//        "player_slot": 130,
//        "hero_id": 51,
//        "item_0": 50,
//        "item_1": 212,
//        "item_2": 145,
//        "item_3": 172,
//        "item_4": 116,
//        "item_5": 46,
//        "backpack_0": 43,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 7,
//        "deaths": 15,
//        "assists": 17,
//        "leaver_status": 0,
//        "last_hits": 161,
//        "denies": 18,
//        "gold_per_min": 406,
//        "xp_per_min": 638,
//        "level": 25,
//        "hero_damage": 20557,
//        "tower_damage": 1055,
//        "hero_healing": 0,
//        "gold": 1085,
//        "gold_spent": 13850,
//        "scaled_hero_damage": 13993,
//        "scaled_tower_damage": 725,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5237,
//        "time": 362,
//        "level": 1
//        },
//        {
//        "ability": 5355,
//        "time": 489,
//        "level": 2
//        },
//        {
//        "ability": 5238,
//        "time": 613,
//        "level": 3
//        },
//        {
//        "ability": 5237,
//        "time": 657,
//        "level": 4
//        },
//        {
//        "ability": 5237,
//        "time": 856,
//        "level": 5
//        },
//        {
//        "ability": 5356,
//        "time": 973,
//        "level": 6
//        },
//        {
//        "ability": 5237,
//        "time": 1142,
//        "level": 7
//        },
//        {
//        "ability": 5355,
//        "time": 1193,
//        "level": 8
//        },
//        {
//        "ability": 5355,
//        "time": 1290,
//        "level": 9
//        },
//        {
//        "ability": 5931,
//        "time": 1313,
//        "level": 10
//        },
//        {
//        "ability": 5238,
//        "time": 1459,
//        "level": 11
//        },
//        {
//        "ability": 5356,
//        "time": 1546,
//        "level": 12
//        },
//        {
//        "ability": 5355,
//        "time": 1681,
//        "level": 13
//        },
//        {
//        "ability": 5238,
//        "time": 1760,
//        "level": 14
//        },
//        {
//        "ability": 5941,
//        "time": 2071,
//        "level": 15
//        },
//        {
//        "ability": 5238,
//        "time": 2120,
//        "level": 16
//        },
//        {
//        "ability": 5356,
//        "time": 2233,
//        "level": 17
//        },
//        {
//        "ability": 6512,
//        "time": 2628,
//        "level": 18
//        },
//        {
//        "ability": 5976,
//        "time": 2979,
//        "level": 19
//        }
//        ]
//        },
//        {
//        "account_id": 125791607,
//        "player_slot": 131,
//        "hero_id": 71,
//        "item_0": 152,
//        "item_1": 90,
//        "item_2": 229,
//        "item_3": 127,
//        "item_4": 180,
//        "item_5": 178,
//        "backpack_0": 0,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 10,
//        "deaths": 14,
//        "assists": 12,
//        "leaver_status": 0,
//        "last_hits": 168,
//        "denies": 0,
//        "gold_per_min": 409,
//        "xp_per_min": 436,
//        "level": 22,
//        "hero_damage": 25365,
//        "tower_damage": 651,
//        "hero_healing": 0,
//        "gold": 309,
//        "gold_spent": 16010,
//        "scaled_hero_damage": 15497,
//        "scaled_tower_damage": 436,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5256,
//        "time": 332,
//        "level": 1
//        },
//        {
//        "ability": 5353,
//        "time": 511,
//        "level": 2
//        },
//        {
//        "ability": 5256,
//        "time": 658,
//        "level": 3
//        },
//        {
//        "ability": 5111,
//        "time": 732,
//        "level": 4
//        },
//        {
//        "ability": 5256,
//        "time": 831,
//        "level": 5
//        },
//        {
//        "ability": 5364,
//        "time": 908,
//        "level": 6
//        },
//        {
//        "ability": 5256,
//        "time": 1060,
//        "level": 7
//        },
//        {
//        "ability": 5111,
//        "time": 1141,
//        "level": 8
//        },
//        {
//        "ability": 5111,
//        "time": 1302,
//        "level": 9
//        },
//        {
//        "ability": 5918,
//        "time": 1462,
//        "level": 10
//        },
//        {
//        "ability": 5111,
//        "time": 1516,
//        "level": 11
//        },
//        {
//        "ability": 5353,
//        "time": 1614,
//        "level": 12
//        },
//        {
//        "ability": 5364,
//        "time": 1711,
//        "level": 13
//        },
//        {
//        "ability": 5353,
//        "time": 2012,
//        "level": 14
//        },
//        {
//        "ability": 5932,
//        "time": 2072,
//        "level": 15
//        },
//        {
//        "ability": 5353,
//        "time": 2120,
//        "level": 16
//        },
//        {
//        "ability": 5364,
//        "time": 2280,
//        "level": 17
//        },
//        {
//        "ability": 6008,
//        "time": 2552,
//        "level": 18
//        }
//        ]
//        },
//        {
//        "account_id": 132930480,
//        "player_slot": 132,
//        "hero_id": 112,
//        "item_0": 141,
//        "item_1": 63,
//        "item_2": 46,
//        "item_3": 158,
//        "item_4": 156,
//        "item_5": 236,
//        "backpack_0": 0,
//        "backpack_1": 0,
//        "backpack_2": 0,
//        "kills": 10,
//        "deaths": 8,
//        "assists": 11,
//        "leaver_status": 0,
//        "last_hits": 185,
//        "denies": 5,
//        "gold_per_min": 494,
//        "xp_per_min": 710,
//        "level": 25,
//        "hero_damage": 27882,
//        "tower_damage": 988,
//        "hero_healing": 0,
//        "gold": 876,
//        "gold_spent": 20945,
//        "scaled_hero_damage": 14151,
//        "scaled_tower_damage": 644,
//        "scaled_hero_healing": 0,
//        "ability_upgrades": [
//        {
//        "ability": 5045,
//        "time": 328,
//        "level": 1
//        },
//        {
//        "ability": 5066,
//        "time": 483,
//        "level": 2
//        },
//        {
//        "ability": 5066,
//        "time": 557,
//        "level": 3
//        },
//        {
//        "ability": 5354,
//        "time": 712,
//        "level": 4
//        },
//        {
//        "ability": 5066,
//        "time": 840,
//        "level": 5
//        },
//        {
//        "ability": 5229,
//        "time": 959,
//        "level": 6
//        },
//        {
//        "ability": 5066,
//        "time": 1074,
//        "level": 7
//        },
//        {
//        "ability": 5354,
//        "time": 1155,
//        "level": 8
//        },
//        {
//        "ability": 5354,
//        "time": 1243,
//        "level": 9
//        },
//        {
//        "ability": 5925,
//        "time": 1399,
//        "level": 10
//        },
//        {
//        "ability": 5354,
//        "time": 1528,
//        "level": 11
//        },
//        {
//        "ability": 5229,
//        "time": 1702,
//        "level": 12
//        },
//        {
//        "ability": 5045,
//        "time": 1737,
//        "level": 13
//        },
//        {
//        "ability": 5045,
//        "time": 1816,
//        "level": 14
//        },
//        {
//        "ability": 5941,
//        "time": 1845,
//        "level": 15
//        },
//        {
//        "ability": 5045,
//        "time": 1926,
//        "level": 16
//        },
//        {
//        "ability": 5229,
//        "time": 2069,
//        "level": 17
//        },
//        {
//        "ability": 6008,
//        "time": 2162,
//        "level": 18
//        },
//        {
//        "ability": 6297,
//        "time": 2744,
//        "level": 19
//        }
//        ]
//        }
//        ],
//        "radiant_win": true,
//        "duration": 2778,
//        "pre_game_duration": 90,
//        "start_time": 1494941023,
//        "match_id": 3184216260,
//        "match_seq_num": 2781522884,
//        "tower_status_radiant": 1844,
//        "tower_status_dire": 0,
//        "barracks_status_radiant": 63,
//        "barracks_status_dire": 0,
//        "cluster": 227,
//        "first_blood_time": 0,
//        "lobby_type": 0,
//        "human_players": 10,
//        "leagueid": 0,
//        "positive_votes": 0,
//        "negative_votes": 0,
//        "game_mode": 18,
//        "flags": 1,
//        "engine": 1,
//        "radiant_score": 64,
//        "dire_score": 37
//        }
//        }
