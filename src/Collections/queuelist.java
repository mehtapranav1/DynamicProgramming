package Collections;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;

public class queuelist {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");

        System.out.println(queue.element());

//        for(String i: queue)
//            System.out.println(i+"");
    }
}
