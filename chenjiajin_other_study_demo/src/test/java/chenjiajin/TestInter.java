package chenjiajin;

import chenjiajin.concurrency.service.IGetAllStudent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.CountDownLatch;

@SpringBootTest(classes = OthersDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestInter {

    private static final int MAX_THREADS = 1000;//模拟1000用户请求 做并发调用远程接口

    private CountDownLatch cdl = new CountDownLatch(MAX_THREADS);//花名册

    @Autowired
    IGetAllStudent iGetAllStudent;

    @Test
    public void testInterface() throws Exception {
        for (int i = 0; i < MAX_THREADS; i++) {
            new Thread(() -> {
                try {
                    /**
                     *  countDown会把入参值 -- 直到减到0的时候 await 才不会阻塞 才会进行下面的逻辑
                     */
                    cdl.countDown();// 自减1
                    cdl.await();//只要入参大于0就会阻塞在这里
                    /**
                     * 这时候入参1000 已经自减完成 然后就并发 1000 个用户进来了
                     */
                    iGetAllStudent.getAllStudent();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(2000);
    }
}



















