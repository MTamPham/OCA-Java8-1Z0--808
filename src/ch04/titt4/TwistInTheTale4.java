package ch04.titt4;

import java.util.ArrayList;

public class TwistInTheTale4 {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        String one = "One";
        String two = new String("Two");
        myArrList.add(one);
        myArrList.add(two);
        ArrayList<String> yourArrList = myArrList;
        one.replace("O", "B");
        for (String element : myArrList) {
            System.out.print(element + ":");
        }
        for (String element : yourArrList) {
            System.out.print(element + ":");
        }
        System.out.println();
    }
}
