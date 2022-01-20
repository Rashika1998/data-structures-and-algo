package stack;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
         * stack - LIFO data structure. Last-in first-out
         * stores objects into a sort of vertical tower
         * push() -> add to the top
         * pop() -> to remove from the top
         * empty() -> check whether stack is empty or not
         * peek() -> to display the top item
         * search() -> to find an item
         * */

        Stack<String> stack = new Stack<String>();

        //empty() - to check whether stack is empty or not
        System.out.println(stack.empty());

        //push() - to add items to the top of stack
        stack.push("Minecraft");
        stack.push("Call of duty mobile");
        stack.push("Into the dead");
        stack.push("Mortal Combat");
        stack.push("Modern combat");

        //This is the output*******************

        //Modern Combat       - 1
        //Mortal Combat       - 2
        //Into the dead       - 3
        //Call Of Duty mobile - 4
        //Minecraft           - 5

        System.out.println(stack);

        //pop() - to remove items from the top
        stack.pop();

        System.out.println(stack);

        //This is the output***************

        //Call Of Duty mobile
        //Minecraft

        String whatRemoved = stack.pop();
        System.out.println(whatRemoved);

        //peak() - shows top items of the stack
        //This will not remove any item from the stack
        System.out.println(stack.peek());


        //search(); - search items
        System.out.println(stack.search("Into the dead"));



        ///Use of stack

        // 1. undo/redo feature in text editor
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions ( call stack )


    }

}
