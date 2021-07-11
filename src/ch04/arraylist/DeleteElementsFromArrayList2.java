package ch04.arraylist;

import java.util.ArrayList;

class MyPerson {
    String name;

    MyPerson(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MyPerson) { // null and object of type other than MyPerson can't be equal to this object
            MyPerson p = (MyPerson) o;
            return p.name.equals(this.name); // compare name of method parameter to that of this object's name
        }
        return false;
    }
}

public class DeleteElementsFromArrayList2 {
    public static void main(String[] args) {
        ArrayList<MyPerson> myArrList = new ArrayList<>();
        MyPerson p1 = new MyPerson("John");
        MyPerson p2 = new MyPerson("Paul");
        MyPerson p3 = new MyPerson("Harry");
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p3);
        myArrList.remove(new MyPerson("Paul")); // removes Paul
        for (MyPerson element : myArrList) {
            System.out.println(element.name); // prints John and Harry
        }
    }
}
