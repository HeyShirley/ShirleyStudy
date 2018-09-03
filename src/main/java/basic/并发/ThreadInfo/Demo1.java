package basic.并发.ThreadInfo;

/**
 * Created by zhaoxueyu on 2018/8/5.
 */
public class Demo1 {


    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        Thread proxy = new Thread(t1, "default_thread");
        proxy.setName("test");

        System.out.println(proxy.getName());
        System.out.println(Thread.currentThread().getName());//main

        proxy.start();
        Thread.sleep(200);

        t1.stop();
    }

}
