package linearSearch;

public class Main {
    public static void main(String[] args) {

        /*

        Linear search: Iterate through a collection one element at a time

                        runtime complexity : O(n)

                        Disadvantages:
                        Slow for large data sets

                        Advantages :
                        Fast for searches of small to medium data sets
                        Does not need to stored
                        Useful for data structure that do not have random access (LinkedList)

        */


        int[] array = {1, 2, 3, 5, 8, 4, 6, 7, 9, 10};

        int index = linearSearch(array, 4);

        if(index != -1){
            System.out.println("Element found: " + index);
        }
        else{
            System.out.println("Element not found.");
        }



    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}
