package javaPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Arraylist {
    public static void main(String[] args) {
        //ArrayList does not have insertion and deletion methods.
        //Linked list have addFirst ,addLast methods for insertion and for deletion  remove methods are present
        //List allows duplicate and null vaues

        LinkedList ll=new LinkedList();
        ll.add("Shalini");
        ll.add("1");
        ll.addFirst("0");
        ll.addLast(3);
        System.out.println(ll);
        for(int i=0;i<ll.size();i++){
            //System.out.println(ll.get(i));
            if(ll.get(i).equals("Shalini")){ //print only perticular item
                System.out.println(ll.get(i));
                break;
            }
        }
        System.out.println("using forEach loop:");
        for(Object str : ll){   //using forEach loop
            System.out.println(str);

        }
        System.out.println("Using Iterator:");

        Iterator itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        //methods in linked list
        ll.set(0,"Piya");
        ll.set(3,"Sudeeksha");
        ll.add(true);
        ll.add("Sudeeksha");
        ll.add(null);
        ll.add(null);

        ll.add(null);

        System.out.println(ll);
        System.out.println("After removing");
        ll.remove("1");
        System.out.println(ll);

        //ll.removeIf(str->str.equals("1"));



    }



}
