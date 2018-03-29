package basic.序列化;

import basic.对象和引用的区别.Obj;

import java.io.*;

/**
 * Created by zhaoxueyu on 2018/3/30.
 */
public class People implements Serializable{
    private String name;
    private int age;
    public People(){
        this.name = "lili";
        this.age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        People p = new People();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            FileOutputStream fos = new FileOutputStream("people.out");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        People p1;
        try {
            FileInputStream fis = new FileInputStream("people.out");
            ois = new ObjectInputStream(fis);
            p1 = (People)ois.readObject();
            System.out.println("name：" + p1.getName());
            System.out.println("age：" + p1.getAge());
            ois.close();
        }catch (Exception ex){

        }
    }
}
