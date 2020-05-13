package chenjiajin.utils;


import java.util.List;
import java.util.Map;
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
     */
    void set(String key, Object val, Integer time);

    /**
     * 额外给key添加过期时间，默认24大于小时整
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

    /**
     * 删除指定key
     *
     * @param key
     * @return
     */
    boolean deleteKey(String key);

    /**
     * 通过批量的key获取批量的val
     * String = key
     *
     * @return
     */
    List<Object> mGet(List<String> key);

    /**
     * 批量插入
     * String = key
     * Object = val
     *
     * @return
     */
    boolean mSet(Map<String, Object> map);

    /**
     * 从右边（末尾）添加一个值到list中
     *
     * @param key
     * @param val
     */
    Long rPush(String key, Object val);

    /**
     * 从右边（末尾）添加很多值到list中
     *
     * @param key
     * @param val
     */
    Long rPush(String key, List<Object> val);

    /**
     * 获取指定区域内的list的数据
     *
     * @param key
     * @param page
     * @param pageSize 0 -1 代表获取全部数据 0 2 代表获取三条数据 分别是下标为 0 1 2 的三条数据
     * @return
     */
    List<Object> lRange(String key, Integer page, Integer pageSize);

    /**
     * 获取集合左边第一个数据并删除，如果没有数据，则删除整个集合
     *
     * @param key
     * @return
     */
    Object lPop(String key);

    /**
     * 在规定的毫秒时间内取出数值，如有取出就删除并返回，否则没有
     * @param key
     * @param time
     * @return
     */
    Object lPop(String key,Integer time);
}
