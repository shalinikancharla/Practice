package javaPractice;

import java.util.Stack;

public class StackDemo {
        public static void main(String[] args) {
            //stack allows duplicate and null vaues
            Stack<String> s=new Stack<>();  //stack is FILO and LIFO
            s.push("1");
            s.push("2");
            s.push("3");
            s.push("4");
            s.push("5");
            //s.push("5");
            //s.push(null);

            System.out.println(s);  //[1, 2, 3, 4, 5]


            System.out.println(s.pop()); //5
            System.out.println(s); //[1, 2, 3, 4]

            System.out.println(s.peek());//return the top object but didn't remove->4
            System.out.println(s); //[1, 2, 3, 4]
            System.out.println(s.search("3"));//2 -->if it is true return positive values
            System.out.println(s.search("7")); //-1  -->if it is false return negative values
            System.out.println(s.empty()); //false









        }

}
