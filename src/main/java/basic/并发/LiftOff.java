package basic.并发;

/**
 * Created by zhaoxueyu on 2018/4/11.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){
    }

    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "liftooff!") + "). ";
    }

    public void run(){
        while (countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
