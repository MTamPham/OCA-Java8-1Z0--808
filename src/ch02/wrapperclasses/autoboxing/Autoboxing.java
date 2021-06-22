package ch02.wrapperclasses.autoboxing;

import java.util.ArrayList;

/*
 * Autoboxing is the automatic conversion of a primitive date type to an object of an corresponding wrapper class.
 * Unboxing is the automatic conversion of an object of an wrapper class to a corresponding primitive data type.
 *
 * Note: Unboxing a wrapper reference variable, which refers to null, will throw a NullPointerException.
 */
public class Autoboxing {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(12.67);
        System.out.println(d1.compareTo(21.68));  // autoboxing - convert the primitive double of value 21.68 to an object of the class Double, so compareTo() works here

        ArrayList<Double> list = new ArrayList<>();
        list.add(12.12); // autoboxing - convert the primitive double to an object of the class Double
        list.add(11.24);
        Double total = 0.0;
        for (Double d : list) {
            total += d; // unboxing - convert the object of the class Double to a primitive double so operator += works here (Remember arithmetic operators can use in primitive types only)
        }
        System.out.println(total);
    }
}
