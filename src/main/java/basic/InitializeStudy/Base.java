package basic.InitializeStudy;

/**
 * Created by zhaoxueyu on 2018/3/27.
 */
public class Base {
    static {
        System.out.println("Base static block");
    }
    {
        System.out.println("Base  block");
    }
    public Base(){
        System.out.println("Base constructor");
    }
}
