package chenjiajin;

import chenjiajin.utils.RedisTemplates;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        redisTemplates.decrKey("a");
    }
    @Test
    void context123Loads222() {
        System.out.println(redisTemplates.get("aaaaa"));
    }

}
