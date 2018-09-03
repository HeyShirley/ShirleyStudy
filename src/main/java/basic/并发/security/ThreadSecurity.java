package basic.并发.security;

import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;

/**
 * Created by zhaoxueyu on 2018/8/5.
 */
@ThreadSafe
public class ThreadSecurity {

//    @GuardedBy("this")
    public void test(){

    }

    public static void main(String[] args) {
    }
}
