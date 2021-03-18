package com.datai.rpc.serialize;

/**
 * 定义序列化框架
 */
public abstract class Serializer {

    /**
     * 序列化操作
     * @param obj
     * @param <T>
     * @return
     */
    public abstract <T> byte[] serialize(T obj);

    /**
     * 反序列化操作
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T> Object deserialize(byte[] bytes, Class<T> clazz);
}
