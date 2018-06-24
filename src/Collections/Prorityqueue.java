package Collections;
import  java.util.PriorityQueue;
import  java.util.Queue;

public class Prorityqueue {
    public static void main(String[] args) {
        Queue<edges> queue = new PriorityQueue<>();

        queue.add(new edges("ab",1));
        queue.add(new edges("ac",3));
        queue.add(new edges("ad",8));


        while( queue.peek() != null )
            System.out.println(queue.poll());


    }
}
