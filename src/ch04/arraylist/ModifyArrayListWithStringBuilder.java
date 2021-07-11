package ch04.arraylist;

import java.util.ArrayList;

/*
 * We can also modify an ArrayList by modifying all of its existing values.
 */
public class ModifyArrayListWithStringBuilder {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myArrList = new ArrayList<>();
        myArrList.add(new StringBuilder("One"));
        myArrList.add(new StringBuilder("Two"));
        myArrList.add(new StringBuilder("Three"));
        for (StringBuilder element : myArrList) {
            element.append(element.length()); // access ArrayList elements and modify them
        }
        for (StringBuilder element : myArrList) {
            System.out.println(element);
        }
    }
}
