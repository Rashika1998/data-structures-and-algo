package queue;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*Queue - First-in First-out (ex: line of people)
         * A collection designed for holding elements prior to processing
         * Linear data structure
         *
         * offer(), add(): enqueue, to add item
         * poll(), remove(): dequeue, remove items
         * peek(), element(): get head item without removing
         *
         * */

        //We can't instantiate the queue because it is an interface
        //LinkedList -> Deque -> Queue
        //We can instantiate LinkedList

        Queue<String> queue = new LinkedList<String>();

        //Adding some items to the queue
        queue.offer("A");
        queue.offer("B");
        queue.add("C");
        queue.add("D");

        System.out.println(queue);

        //Removing items from the queue
        queue.poll();
        queue.remove();

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());


        //What is used for

        // 1. Keyboard buffer (letters should appear on the screen in order they are pressed)
        // 2. Printer queue (Print jobs should be completed in order)
        // 3. Used is LinkedLists, PriorityQueues, Breadth-first search


    }
}
