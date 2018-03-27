package basic.jiekouStudy.jiekou;

import java.util.ArrayList;

/**
 * Created by zhaoxueyu on 2018/3/27.
 */
public class Test {
    public static ArrayList<Stuff> collectStuff(Stuff[] s){
        ArrayList<Stuff> al = new ArrayList<Stuff>();
        for (int i = 0 ; i < s.length; i++){
            if (! (s[i] instanceof Rubbish)){
                al.add(s[i]);
            }
        }
        return al;
    }
    public static void main(String[] args){
        Stuff[] s = {
                new Gold(), new Copper(), new Gun(), new Grenade(), new Stone()
        };
        ArrayList<Stuff> al = collectStuff(s);
        System.out.println("The usefull Stuff collected is: ");
        for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
