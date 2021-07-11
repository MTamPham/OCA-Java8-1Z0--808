package ch04.arraylist;

import java.util.ArrayList;

public class DeleteElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myArrList = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb3);
        myArrList.add(sb4);
        myArrList.remove(1); // remove element at position 1
        for (StringBuilder element : myArrList) {
            System.out.println(element); // prints One, Three, Four
        }
        myArrList.remove(sb3); // remove Three from list
        myArrList.remove(new StringBuilder("Four")); // doesn't remove Four because equals() method return false
        System.out.println();
        for (StringBuilder element : myArrList) {
            System.out.println(element); // prints One, Four
        }
    }
}
