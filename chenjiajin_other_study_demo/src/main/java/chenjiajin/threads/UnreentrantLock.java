package chenjiajin.threads;

public class UnreentrantLock {

    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {

        System.out.println("进入lock加锁 "+Thread.currentThread().getName());

        //判断是否已经被锁，如果被锁则当前请求的线程进行等待
        while (isLocked){
            System.out.println("进入wait等待 "+Thread.currentThread().getName());
            wait();
        }
        //进行加锁
        isLocked = true;
    }
    public synchronized void unlock(){
        System.out.println("进入unlock解锁 "+Thread.currentThread().getName());
        isLocked = false;
        //唤醒对象锁池里面的一个线程
        notify();
    }
}

class main{
    private UnreentrantLock unreentrantLock = new UnreentrantLock();
    //加锁建议在try里面，解锁建议在finally
    public void  methodA(){
        try {
            unreentrantLock.lock();
            System.out.println("methodA方法被调用");
            methodB();
        }catch (InterruptedException e){
            e.fillInStackTrace();
        } finally {
            unreentrantLock.unlock();
        }
    }

    public void methodB(){
        try {
            unreentrantLock.lock();
            System.out.println("methodB方法被调用");
        }catch (InterruptedException e){
            e.fillInStackTrace();
        } finally {
            unreentrantLock.unlock();
        }
    }
    public static void main(String [] args){
        //演示的是同个线程
        new main().methodA();
    }
}
