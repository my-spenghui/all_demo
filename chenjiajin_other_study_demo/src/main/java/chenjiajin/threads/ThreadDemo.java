package chenjiajin.threads;

/**
 * 锁的运用
 */
public class ThreadDemo {

    public static int num = 0;

    public static synchronized void add2(){
        System.out.println(num++);
        System.out.println(System.currentTimeMillis());
    }
    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(()->{
            while (true){
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                add2();
                System.out.println("线程1的num="+num);
            }
        });

        Thread thread2 = new Thread(()->{
            while (true){
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                add2();
                System.out.println("线程2的num="+num);
            }
        });

        Thread thread3 = new Thread(()->{
            while (true){
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                add2();
                System.out.println("线程3的num="+num);
            }
        });
        thread.start();
        thread2.start();
        thread3.start();


    }

}
