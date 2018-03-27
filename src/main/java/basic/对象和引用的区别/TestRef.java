package basic.对象和引用的区别;


/**
 * Created by zhaoxueyu on 2018/3/28.
 */
public class TestRef {
    private Obj aObj = new Obj();
    private int aInt = 0;
    public Obj getaObj(){
        return aObj;
    }
    public int getaInt(){
        return aInt;
    }
    public void changeObj(Obj inObj){
        inObj.setStr("changed value");
    }
    public void changeInt(int inInt){
        inInt = 1;
    }
    public static void main(String[] args){
        TestRef oRef = new TestRef();
        System.out.println("*****************引用类型******************");
        System.out.println("调用changeObj()前：" + oRef.getaObj());
        oRef.changeObj(oRef.getaObj());
        System.out.println("调用changeObj()后：" + oRef.getaObj());
        System.out.println("*****************基本数据类型******************");
        System.out.println("调用changeInt()前：" + oRef.getaInt());
        oRef.changeInt(oRef.getaInt());
        System.out.println("调用changeInt()后：" + oRef.getaInt());
    }
}
