package basic.InitializeStudy;

/**
 * Created by zhaoxueyu on 2018/3/27.
 */
public class Derived extends Base {
    static {
        System.out.println("Derived static block");
    }
    {
        System.out.println("Derived block");
    }
    public Derived(){
        System.out.println("Derived constructor");
    }
    public static void main(String[] args){
        new Derived();
    }
}
