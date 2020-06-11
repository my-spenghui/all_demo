package chenjiajin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("chenjiajin.chenjiajin_back_end_demo.mapper")
@EnableTransactionManagement
public class ChenjiajinBackEndDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenjiajinBackEndDemoApplication.class, args);
    }

}
