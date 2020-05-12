package chenjiajin.utils.impl;

import chenjiajin.utils.RedisTemplates;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 操作redis的工具类
 */
@Service
public class RedisTemplatesImpl implements RedisTemplates {
    //        TimeUnit.DAYS          //天
    //        TimeUnit.HOURS         //小时
    //        TimeUnit.MINUTES       //分钟
    //        TimeUnit.SECONDS       //秒
    //        TimeUnit.MILLISECONDS  //毫秒
    private static Logger LOG = LoggerFactory.getLogger(RedisTemplatesImpl.class);

    @Autowired
    private RedisTemplate<String, Object> redis;

    /**
     * 存储String到redis中
     *
     * @param key
     * @param val
     * @return
     */
    @Override
    public void set(String key, String val) {
        redis.opsForValue().set(key, val);
    }

    /**
     * 存储任意类型到redis中
     *
     * @param key
     * @param val
     * @return
     */
    @Override
    public void set(String key, Object val) {
        redis.opsForValue().set(key, val);
    }

    /**
     * 根据timeunit来设置key的过期时间
     *
     * @param key
     * @param val
     * @param time
     * @param timeUnit
     */
    @Override
    public void set(String key, Object val, Integer time, TimeUnit timeUnit) {
        redis.opsForValue().set(key, val, time, timeUnit);
    }

    /**
     * 默认给指定key多设置一天的时间(24小时整)
     *
     * @param key
     * @return
     */
    @Override
    public boolean setKeyTime(String key) {
        return redis.expire(key, 24, TimeUnit.HOURS);
    }

    /**
     * 给key灵活的设置过期时间
     *
     * @param key
     * @return
     */
    @Override
    public boolean setKeyTime(String key, Integer time, TimeUnit timeUnit) {
        return redis.expire(key, time, timeUnit);
    }

    /**
     * 给key设置自增1
     *
     * @param key
     */
    @Override
    public boolean incrKey(String key) {
        if (isInteger(key)) {
            redis.opsForValue().increment(key);
            return true;
        }
        LOG.error("key：" + key + ",自增1失败，因为这原本的值不是个整数类型");
        return false;
    }

    /**
     * 给key设置自增的值
     *
     * @param key
     * @param val
     */
    @Override
    public void incrKey(String key, Double val) {
        redis.opsForValue().increment(key, val);
    }

    /**
     * 给key设置自增的值
     *
     * @param key
     * @param val
     */
    @Override
    public boolean incrKey(String key, Integer val) {
        if (isInteger(key)) {
            redis.opsForValue().increment(key, val);
            return true;
        }
        LOG.error("key：" + key + ",自增:" + val + "失败，因为这原本的值不是个整数类型");
        return false;
    }

    /**
     * 获取key的值
     *
     * @param key
     * @return
     */
    @Override
    public Object get(String key) {
        return redis.opsForValue().get(key);
    }

    /**
     * 给指定key自减1
     *
     * @param key
     */
    @Override
    public boolean decrKey(String key) {
        if (isInteger(key)) {
            redis.opsForValue().decrement(key);
            return true;
        }
        LOG.error("key：" + key + ",自减1失败，因为这原本的值不是个整数类型");
        return false;
    }

    /**
     * 给指定key自减指定数值
     *
     * @param key
     * @param val
     */
    @Override
    public boolean decrKey(String key, Integer val) {
        if (isInteger(key)) {
            redis.opsForValue().decrement(key, val);
            return true;
        }
        LOG.error("key：" + key + ",自减:" + val + "失败，因为这原本的值不是个整数类型");
        return false;
    }


    /**
     * 判断是否为整数
     *
     * @param key
     * @return
     */
    private boolean isInteger(String key) {
        Object val = get(key);
        if (val instanceof Integer || val instanceof Long || val instanceof Byte || val instanceof Short) {
            return true;
        }
        return false;
    }
}
