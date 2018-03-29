package basic.类加载机制;

import java.util.ArrayList;

/**
 * Created by zhaoxueyu on 2018/3/29.
 */

class CmdQueryPricePolicy{

}

public class Test {
    public static void main(String[] args) {
        System.out.println((CmdQueryPricePolicy.class.getName()).getClass());
        System.out.println((CmdQueryPricePolicy.class.getSimpleName()).getClass());
    }
}
