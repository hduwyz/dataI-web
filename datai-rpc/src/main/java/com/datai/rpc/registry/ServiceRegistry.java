package com.datai.rpc.registry;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public abstract class ServiceRegistry {

    /**
     * 服务启动初始化
     */
    public abstract void start(Map<String, String> param);

    /**
     * 服务停止
     */
    public abstract void stop();

    /**
     * 注册服务
     * @param keys
     * @param value
     * @return
     */
    public abstract boolean registry(Set<String> keys, String value);

    /**
     * 移除服务
     * @param keys
     * @param value
     * @return
     */
    public abstract boolean remove(Set<String> keys, String value);

    /**
     * 查找服务（多个服务查找）
     * @param keys
     * @return
     */
    public abstract Map<String, TreeSet<String>> discovery(Set<String> keys);

    /**
     * 查找服务（单个服务查找）
     * @param key
     * @return
     */
    public abstract TreeSet<String> discovery(String key);
}
