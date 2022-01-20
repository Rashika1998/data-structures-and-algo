package linkedList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /*

        LinkedList  :  stores Nodes in 2 parts(data + address)
        Nodes are in non-consecutive memory locations
        Elements are linked using pointers

        *****Singly Linked List*****
        node                   node                   node
        [data, address] ->     [data, address] ->     [data, address]

        *****Doubly Linked List*****
        node                             node                             node
        [address, data, address] <->     [address, data, address] <->     [address, data, address]
        advantages
        1. Dynamic data structures (allocates needed memory while running)
        2. Insertion and deletion is easy
        3. No/Low memory waste
        disadvantages
        1. Greater memory usage
        2. No random access of elements
        3. Accessing and searching is time-consuming
        ues?
        1. implement stacks / Queues
        2. GPS navigation
        3. Music player

        */


        //We can use features in stack and queue

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");

        System.out.println(linkedList);

        // indexOf() will show index of element
        System.out.println(linkedList.indexOf("D"));
        System.out.println(linkedList.indexOf("A"));

        //PeekFirst() will show first element
        System.out.println(linkedList.peekFirst());

        // peekLast() will show last element
        System.out.println(linkedList.peekLast());

        //addFirst() will add element at the first
        linkedList.addFirst("0");
        System.out.println(linkedList);

        //addLast() will add element to the last
        linkedList.addLast("G");
        System.out.println(linkedList);


        //removeFirst() : remove first element
        //removeLast() : remove last element

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);


        String lastItem = linkedList.peekLast();
        int lastIndex = linkedList.indexOf(lastItem);

        System.out.println(lastIndex);

        for (int i = 0; i < lastIndex; i++){
            System.out.println(linkedList.peekFirst());
            linkedList.removeFirst();
        }


        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("a");
        arrList.add("b");
        arrList.add("c");

        System.out.println(arrList);
        arrList.add(1,"B");
        arrList.add(3,"C");
        System.out.println(arrList);











    }
}
