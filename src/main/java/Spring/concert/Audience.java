package Spring.concert;

import com.sun.javafx.geom.AreaOp;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面
 * 观看演出的类
 * Created by zhaoxueyu on 2018/4/21.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* Spring.concert.Performance.perfom(..))")
    public void performance(){
    }

    //@Around注解：环绕通知方法：
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){   //ProcceedingJoinPoint对象：通过该对象调用被通知方法
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();   //若不调用proceed方法，会阻塞被通知方法的访问，即阻塞调用方调用Audience的watchPerformance方法。
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
