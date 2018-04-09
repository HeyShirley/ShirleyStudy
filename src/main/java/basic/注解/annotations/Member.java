package basic.注解.annotations;

/**
 * Created by zhaoxueyu on 2018/4/9.
 */
@DBTable(name = "Member")
public class Member {
    @SqlString(30)
    String firstname;

    @SqlString(50)
    String lasttname;

    @SQLInteger
    Integer age;

    @SqlString(value = 30,constraints = @Constraints(primaryKey=true))
    String handle;

    static int menberCount;

    public String getFirstname() {
        return firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return handle;
    }

}
