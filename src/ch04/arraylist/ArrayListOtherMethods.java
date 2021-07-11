package ch04.arraylist;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class ArrayListOtherMethods {
    public static void main(String[] args) {
        /*
         * There are overloaded versions of method addAll to add multiple elements to an ArrayList from another ArrayList
         * or any other class that's a subclass of Collection.
         * - addAll(Collection<? extends E> c) - appends all the elements in the specified collection to the end of this list
         * in the order in which they're returned by the specified collection's Iterator.
         * - addAll(int index, Collection<? extends E> c) - inserts all the elements in the specified collection into
         * this list, starting at the specified position.
         */
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("One");
        myArrList.add("Two");
        ArrayList<String> yourArrList = new ArrayList<>();
        yourArrList.add("Three");
        yourArrList.add("Four");
        myArrList.addAll(1, yourArrList); // add all elements of yourArrList to myArrList at position 1
        for (String element : myArrList) {
            System.out.println(element); // prints One Three Four Two
        }

        /*
         * We can remove all the ArrayList elements by calling the method clear() on it.
         */
        ArrayList<String> myArrList2 = new ArrayList<>();
        myArrList2.add("One");
        myArrList2.add("Two");
        myArrList2.clear();
        for (String element : myArrList2) {
            System.out.println(element); // prints nothing because there are no more elements in myArrList2
        }

        /*
         * We can retrieve an object at a particular position in ArrayList by calling the method get(int index). Behind
         * the scenes, the method will check whether the requested position exists in the ArrayList by comparing it with
         * the array's size. If the requested element isn't within the range, the method throws a
         * java.lang.IndexOutOfBoundsException error at runtime.
         */
        ArrayList<String> myArrList3 = new ArrayList<>();
        myArrList3.add("One");
        myArrList3.add("Two");
        String valFromList = myArrList3.get(1);
        System.out.println(valFromList); // prints Two - element at position 1
        System.out.println(myArrList3.size()); // prints 2

        /*
         * The remaining three methods require a strong understanding of how to determine the equality of objects.
         * - contains(Object o) - returns true if the list contains the specified element
         * - indexOf(Object o) - returns the index of the first occurrence of the specified element in this list, or -1 if
         * this list doesn't contain the element
         * - lastIndexOf(Object o) - returns the index of the last occurrence of the specified element in this list, or -1
         * if this list dones't contain the element
         */
        ArrayList<StringBuilder> myArrList4 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        myArrList4.add(sb1);
        myArrList4.add(sb2);
        myArrList4.add(sb2);
        System.out.println(myArrList4.contains(new StringBuilder("Jan"))); // prints false
        System.out.println(myArrList4.contains(sb1)); // prints true
        System.out.println(myArrList4.indexOf(new StringBuilder("Feb"))); // prints -1
        System.out.println(myArrList4.indexOf(sb2)); // prints 1
        System.out.println(myArrList4.lastIndexOf(new StringBuilder("Feb"))); // prints -1
        System.out.println(myArrList4.lastIndexOf(sb2)); // prints 2

        /*
         * The method clone() returns a shallow copy of this ArrayList instance. "Shallow copy" means that this method
         * creates a new instance of the ArrayList object to be cloned. Its element references are copied, but the objects
         * themselves are not.
         */
        ArrayList<StringBuilder> myArrList5 = new ArrayList<>();
        StringBuilder sb3 = new StringBuilder("Jan");
        StringBuilder sb4 = new StringBuilder("Feb");
        myArrList5.add(sb3);
        myArrList5.add(sb4);
        myArrList5.add(sb4);
        ArrayList<StringBuilder> assignedArrList = myArrList5; // assigns object referred to by myArrList to assignedArrList
        ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>) myArrList5.clone(); // clones myArrList and assigns it to clonedArrList
        System.out.println(myArrList5 == assignedArrList); // prints true
        System.out.println(myArrList5 == clonedArrList); // prints false
        StringBuilder myArrVal = myArrList5.get(0); // all of these reference variables refer to the same object
        StringBuilder assignedArrVal = assignedArrList.get(0);
        StringBuilder clonedArrVal = clonedArrList.get(0);
        System.out.println(myArrVal == assignedArrVal); // prints true
        System.out.println(myArrVal == clonedArrVal); // prints true

        /*
         * To create an array from an ArrayList, we can use the method toArray(). It creates a new array, copies the
         * elements of the ArrayList to it, and then returns it.
         *
         * No references to the returned array are maintained by the ArrayList. But the references to the individual
         * ArrayList elements are copied to the returned array and are still referred to by the ArrayList.
         * This implies that if we modify the returned array by swapping the position of its elements or by assigning
         * new objects to its elements, the elements of ArrayList won't be affected. But if we modify the state of
         * elements of the returned array, then the modified state of elements will be reflected in the ArrayList
         */
        ArrayList<MyPerson> myArrList6 = new ArrayList<>();
        myArrList6.add(new MyPerson("One"));
        myArrList6.add(new MyPerson("Two"));
        System.out.println("Original array");
        for (MyPerson element : myArrList6) {
            System.out.println(element.name);
        }
        MyPerson[] myArr = new MyPerson[myArrList6.size()];
        Object[] arr = myArrList6.toArray();
        for (int i = 0, n = myArr.length; i < n; i++) {
            myArr[i] = (MyPerson) arr[i];
            System.out.println(myArr[i].name);
        }
        System.out.println("Unchanged array");
        myArr[1] = new MyPerson("Four"); // assign new objects to elements of returned array won't affect the ArrayList
        for (MyPerson element : myArrList6) {
            System.out.println(element.name);
        }
        for (MyPerson element : myArr) {
            System.out.println(element.name);
        }
        System.out.println("Modified array");
        myArr[1].name = "Three"; // modify the state of elements of returned array affects the ArrayList
        for (MyPerson element : myArrList6) {
            System.out.println(element.name);
        }
        for (MyPerson element : myArr) {
            System.out.println(element.name);
        }
    }
}