package basic.并发;

/**
 * Created by zhaoxueyu on 2018/4/11.
 */
public class BasicThreads {
    public static void main(String[] args){
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
