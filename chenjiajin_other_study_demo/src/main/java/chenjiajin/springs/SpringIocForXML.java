package chenjiajin.springs;

import chenjiajin.springs.domain.Video;
import chenjiajin.springs.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocForXML {

    /**
     * 从配置文件注入bean
     * @param args
     */
    public static void main(String[] args) {
        //找到bean的注入文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取在此配置文件注入的对象的 name或者id  默认用setter注入
        Video video = (Video) applicationContext.getBean("video");
        //bean里面注入别的bean
        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");

        //这个是通过构造函数注入的
        Video video12 = (Video) applicationContext.getBean("video12");
        //自动装配注入
        Video video33 = (Video) applicationContext.getBean("video33");


        System.out.println(video.toString());
        System.out.println(videoOrder.toString());
        System.out.println(video12.toString());
        System.out.println(video33.toString());
    }

}
