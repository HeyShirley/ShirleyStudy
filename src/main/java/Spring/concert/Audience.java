package Spring.concert;

import org.aspectj.lang.annotation.*;

/**
 * 切面
 * 观看演出的类
 * Created by zhaoxueyu on 2018/4/21.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* Spring.concert.Performance.perfom(..))")
    public void perfomance(){
    }

    //表演之前
    @Before("perfomance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    //表演之前
    @Before("perfomance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    //表演之后
    @AfterReturning("perfomance()")
    public void applause(){
        System.out.println("clap clap clap!!!");
    }

    //表演失败之后
    @AfterThrowing("perfomance()")
    public void demandRefund(){
        System.out.println("clap clap clap!!!");
    }
}
