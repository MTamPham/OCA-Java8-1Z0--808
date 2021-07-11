package ch04.arraylist;

import java.util.ArrayList;

/*
 * When we add an element to the end of the list, the ArrayList first checks whether its instance variable elementData has
 * an empty slot at the end. If there's an empty slot at its end, it stores the element at the first available empty slot.
 * If no empty slots exist, the method ensureCapacity() creates another array with higher capacity and copies the existing
 * values to this newly created array. It then copies the newly added value at the first available empty slot in the array.
 *
 * When we add an element at a particular position, an ArrayList creates a new array (only if there's not enough room left)
 * and inserts all its element at positions other than the position we specified. If there are any subsequent elements
 * to the right of the position that we specified, it shifts them by one position. The it adds the new element at the
 * requested position.
 */
public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one"); // add element at the end
        list.add("two");
        list.add("four");
        list.add(2, "three"); // add element at specified location
    }
}
