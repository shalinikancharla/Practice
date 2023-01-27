package javaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        //hasSet not maintained insertion order
        //it does not allows duplicate values
        //it allows only once null values
        HashSet hs=new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(6);
        hs.add("shalini");
        hs.add(5);
       // hs.add(5);
        //hs.add(5);
        hs.add(null);
       // hs.add(null)
        System.out.println(hs);//[null, 1, 2, 5, 6, shalini]
        System.out.println();


        System.out.println("Linked Has set");
        //LinkedhasSet  maintained insertion order
        //it does not allows duplicate values
        //it allows only once null values

        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(1);
        lhs.add(2);
        lhs.add(6);
        lhs.add("shalini");
        lhs.add(5);
         //lhs.add(5);
        //lhs.add(5);
        lhs.add(null);
        // hs.add(null)
        System.out.println(lhs);//[1, 2, 6, shalini, 5, null]




    }

}
