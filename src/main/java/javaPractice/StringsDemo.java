package javaPractice;

import java.util.Arrays;

public class StringsDemo {
    public static void main(String[] args) {
        String str="java is a programming language";
        String[] strr={"Selenium","is","a","open","source","tool"};
        System.out.println(str);
        System.out.println(str.split("  i"));
        System.out.println(str.length());

        for(int i=0;i<strr.length;i++)
        {
            System.out.println(strr[i]);
        }


        String[] str1=str.split("i");
        System.out.println(Arrays.toString(str1));

        String s1="hi";
        String s2="hello";
        String s3= new String(s1+s2);
        System.out.println(s3);


        StringBuilder Sb1=new StringBuilder("Hi");
        StringBuilder Sb2=new StringBuilder("Hello");
        StringBuilder sb3=Sb1.append(Sb2);
        System.out.println(sb3.toString());



    }
}
