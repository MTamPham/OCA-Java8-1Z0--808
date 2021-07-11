package ch04.arraylist;

import java.util.ArrayList;

/*
 * We can modify an ArrayList by replacing an existing element in the ArrayList
 */
public class ReplaceElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("One");
        myArrList.add("Two");
        myArrList.add("Three");
        myArrList.set(1, "One and Half"); // replace ArrayList element at position 1 ("Two") with "One and Half"
        for (String element : myArrList) {
            System.out.println(element);
        }
    }
}
