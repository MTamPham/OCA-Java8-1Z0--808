package ch04.array;

public class TypedArray {
    public static void main(String[] args) {
        /*
         * If the type of an array is an interface, its elements are either null or objects that implement the relevant
         * interface type.
         */
        MyInterface[] interfaceArray = new MyInterface[] {
            new MyClass1(),
            null,
            new MyClass2()
        };

        /*
         * If the type of an array is an abstract class, its elements are either null or objects of concrete classes that
         * extend the relevant abstract class
         */
        Vehicle[] vehicleArray = new Vehicle[] {
            new Car(),
            new Bus(),
            null
        };

        /*
         * If the type of an array is Object, its elements are either null or any object because all classes extend the
         * class java.lang.Object
         */
        Object[] objectArray = new Object[] {
            new MyClass1(),
            null,
            new Car(),
            new java.util.Date(),
            new String("name"),
            new Integer[7]
        };
    }
}

interface MyInterface {}
class MyClass1 implements MyInterface {}
class MyClass2 implements MyInterface {}

abstract class Vehicle {}
class Car extends Vehicle {}
class Bus extends Vehicle {}