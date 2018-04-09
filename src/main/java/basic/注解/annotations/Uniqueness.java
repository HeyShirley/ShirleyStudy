package basic.注解.annotations;


/**
 * Created by zhaoxueyu on 2018/4/9.
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
