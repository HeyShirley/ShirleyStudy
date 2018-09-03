package basic.并发.优先级;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhaoxueyu on 2018/8/4.
 */
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;
    public SimplePriorities(int priority){
        this.priority = priority;
    }

    public String toString(){
        return Thread.currentThread() + ": " + countDown;
    }

    public void run(){
        Thread.currentThread().setPriority(priority);
        while (true){
            for (int i = 1; i < 100000; i++){
                d += (Math.PI + Math.E) / (double)i;
                if ((i %1000) == 0){
                    Thread.yield();
                }
                System.out.println(this);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
            exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
            exec.shutdown();
        }
    }
}
