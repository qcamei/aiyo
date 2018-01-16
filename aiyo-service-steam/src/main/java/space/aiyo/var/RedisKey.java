package space.aiyo.var;

public enum RedisKey {
    SCHEDULE_TIMEID("SCHEDULE_TIMEID",RedisType.SET),
    SEQUENCENUM("SEQUENCENUM",RedisType.STRING),

    ;

    private String key;
    private RedisType dataType;

    public String getKey() {
        return key;
    }

    public RedisType getDataType() {
        return dataType;
    }

    RedisKey(String key, RedisType dataType) {
        this.key = key;
        this.dataType = dataType;
    }

    enum RedisType {
        STRING,
        LIST,
        SET,
        SORTSET,
        HASH;
    }

}
