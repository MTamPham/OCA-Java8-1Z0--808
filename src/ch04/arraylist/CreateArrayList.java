package ch04.arraylist;

import java.util.ArrayList;

/*
 * ArrayList is one of the most widely used classes from the Collections framework.
 *
 * Important properties of an ArrayList:
 * - It implements the interface List
 * - It allows null values to be added to it
 * - It implements all list operations (add, modify, and delete values)
 * - It allows duplicate values to be added to it
 * - It maintains its insertion order
 * - You can use either Iterator or ListIterator to iterate over the items of an ArrayList
 * - It supports generics, making it type safe.
 *
 * Unlike array, an ArrayList automatically increases and decreases in size as elements are added to or removed from it.
 * Behind the scenes, ArrayList defines an instance variable of type Object[] to store all its individual elements.
 */
public class CreateArrayList {
    public static void main(String[] args) {
        // constructs an empty list with an initial capacity of ten
        ArrayList<String> myArrList = new ArrayList<>();
    }
}
