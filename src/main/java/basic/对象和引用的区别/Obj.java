package basic.对象和引用的区别;

/**
 * Created by zhaoxueyu on 2018/3/28.
 */
public class Obj {
    public void setStr(String str){
        this.str = str;
    }
    private String str = "default value";
    public String toString(){
        return str;
    }
}
