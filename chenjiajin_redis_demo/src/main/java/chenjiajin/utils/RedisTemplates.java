package chenjiajin.utils;

import java.util.concurrent.TimeUnit;

public interface RedisTemplates {

    /**
     * 存储String到redis中
     *
     * @param key
     * @param val
     * @return
     */
    void set(String key, String val);

    /**
     * 存储任意类型到redis中
     *
     * @param key
     * @param val
     * @return
     */
    void set(String key, Object val);

    /**
     * 根据timeunit来设置key的过期时间
     *
     * @param key
     * @param val
     * @param time
     * @param timeUnit
     */
    void set(String key, Object val, Integer time, TimeUnit timeUnit);

    /**
     * 默认给指定key多设置一天的时间(24小时整)
     *
     * @param key
     * @return
     */
    boolean setKeyTime(String key);

    /**
     * 给key灵活的设置过期时间
     *
     * @param key
     * @return
     */
    boolean setKeyTime(String key, Integer time, TimeUnit timeUnit);

    /**
     * 给key设置自增1
     *
     * @param key
     */
    boolean incrKey(String key);

    /**
     * 给key设置自增的值
     *
     * @param key
     * @param val
     */
    void incrKey(String key, Double val);

    /**
     * 给key设置自增的值
     *
     * @param key
     * @param val
     */
    boolean incrKey(String key, Integer val);

    /**
     * 获取key的值
     *
     * @param key
     * @return
     */
    Object get(String key);

    /**
     * 给指定key自减1
     *
     * @param key
     */
    boolean decrKey(String key);

    /**
     * 给指定key自减指定数值
     *
     * @param key
     */
    boolean decrKey(String key, Integer val);


}
