package basic.并发.exercise;

/**
 * Created by zhaoxueyu on 2018/8/4.
 */
public class CaseOne {

    private static class Test implements Runnable{
        int id = 0;

        public void run(){
            for (int i = 0; i < 3; i++){
                System.out.println("#" + id + " : [" + i + "]");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args){

    }
}
