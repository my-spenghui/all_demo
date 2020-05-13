package chenjiajin;


import chenjiajin.utils.RedisTemplates;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = RedisDemoApplication.class)
@RunWith(SpringRunner.class)
class RedisDemoApplicationTests {

    @Autowired
    private RedisTemplates redisTemplates;

    @Test
    void contextLoads() {
        redisTemplates.set("aaaaa","sd");
    }
    @Test
    void contextLoads222() {
        System.out.println(redisTemplates.get("mappp"));
    }
    @Test
    void context123Loads222() {
        Map<String,Object> map = new HashMap<>();
        List<Object> list = new ArrayList<>();
        list.add("sd");
        list.add("3r3r");
        list.add("asdfd3");
        list.add("de235");
        System.out.println(redisTemplates.rPush("ll", list));
    }
    @Test
    void con3oads222() {
        System.out.println(redisTemplates.lPop("ll",20000));
    }

}
