package basic.序列化.编程思想;

import java.io.Serializable;

/**
 * Created by zhaoxueyu on 2018/3/31.
 */
public class Data implements Serializable {
    private int n;
    public Data(int n){
        this.n = n;
    }
    public String toString(){
        return Integer.toString(n);
    }
}
