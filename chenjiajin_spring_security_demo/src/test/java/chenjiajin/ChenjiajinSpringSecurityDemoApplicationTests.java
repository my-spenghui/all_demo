package chenjiajin;

import cn.hutool.crypto.digest.BCrypt;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChenjiajinSpringSecurityDemoApplicationTests {

    @Test
    void contextLoads() {
        String code = BCrypt.hashpw("secret",BCrypt.gensalt());
        System.out.println(code);
    }

    public static void main(String[] args) {
        String code = BCrypt.hashpw("secret",BCrypt.gensalt());
        System.out.println(code);
    }

}
