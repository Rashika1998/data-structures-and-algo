package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Arrays..!");

        //Static array
        ArrayList<String> arrList = new ArrayList<>();

        //Dynamic array
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.capacity);

        //dynamicArray.add("A");
        //dynamicArray.add("B");
        //dynamicArray.add("C");

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.isEmpty());









    }

}
