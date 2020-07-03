package chenjiajin.concurrency.synchronizedtest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedTest {

    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
            phone.sendSms();
        }, "线程:1").start();

        new Thread(() -> {
            phone.sendSms();
        }, "线程:2").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        Phone2 phone2 = new Phone2();

        new Thread(() -> {
            phone2.sendSms();
        }, "线程:3").start();

        new Thread(() -> {
            phone2.sendSms();
        }, "线程:4").start();

    }
}

class Phone2 {
    Lock lock = new ReentrantLock();

    public void sendSms() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "\t 发送短信2");
            sendEmail();
        } finally {
            lock.unlock();
        }
    }
    public void sendEmail() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "\t 发送邮件2");
        } finally {
            lock.unlock();
        }
    }
}

class Phone {
    public synchronized void sendSms() {
        System.out.println(Thread.currentThread().getName() + "\t 发送短信");
        sendEmail();
    }

    public synchronized void sendEmail() {
        System.out.println(Thread.currentThread().getName() + "\t 发送邮件");
    }
}