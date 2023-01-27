package javaPractice;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        //In priority Queue only offer and poll methods are present.
        // But in ArrayDeque along with those offerFirst,offerLast,pollFirst,pollLast
        //duplicates are allowed null values are not allowed
        //ArrayDeque adq=new ArrayDeque(); //Queue is FIFO and LILO
        //in some systems priority queue insertion order is not preserved like in windows
        //naturally it will take Ascending order
        ArrayDeque adq=new ArrayDeque();
        //PriorityQueue adq=new PriorityQueue<>();
        adq.offer(1);
        adq.offer(2);
        adq.offer(3);
        adq.offer(6);
        adq.offer(5);
        adq.offer(5);
       // adq.offer(null);
//        adq.offerFirst(0);
//        adq.offerLast(6);
//        System.out.println(adq);
//        adq.pollFirst();
//        adq.pollLast();
//        System.out.println(adq);
//        System.out.println(adq.poll());
        System.out.println(adq);







    }
}
