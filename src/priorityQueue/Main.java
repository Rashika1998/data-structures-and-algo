package priorityQueue;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        /*
         *Priority queue : A First-in First-out data structure
         *that serves elements with the higher priorities first
         *before elements with lower priority.
         */

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        //Collections.reverseOrder() will display elements in reverse order

        queue.offer(3.5);
        queue.offer(3.6);
        queue.offer(3.8);
        queue.offer(3.7);

        Queue<String> newQueue = new PriorityQueue<String>();

        newQueue.offer("A");
        newQueue.offer("C");
        newQueue.offer("D");
        newQueue.offer("B");

        while (!newQueue.isEmpty()){
            System.out.println(newQueue.poll());
        }

    }

}
