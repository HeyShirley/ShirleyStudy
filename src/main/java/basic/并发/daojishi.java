package basic.并发;

/**
 * Created by zhaoxueyu on 2018/8/5.
 */
public class daojishi {

    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        while (true){
            System.out.println(num--);
            Thread.sleep(1000);
            if (num <= 0){
                break;
            }
        }
    }
}
