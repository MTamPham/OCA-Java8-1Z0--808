package ch04.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * There are several ways to access the elements of an ArrayList. We can use get(), an enhanced for loop, Iterator, or
 * ListIterator.
 *
 * An iterator (Iterator or ListIterator) lets us remove elements as we iterate an ArrayList. But it's not possible to
 * remove elements from an ArrayList while iterating it using a for loop.
 */
public class AccessArrayList {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("One");
        myArrList.add("Two");
        myArrList.add("Four");
        myArrList.add(2, "Three");
        for (String element : myArrList) { // use the enhanced for loop
            System.out.println(element);
        }
        ListIterator<String> iterator = myArrList.listIterator(); // use ListIterator
        while (iterator.hasNext()) { // hasNext() indicates whether more elements exist
            System.out.println(iterator.next()); // next() to get the next item from iterator
        }
    }
}
