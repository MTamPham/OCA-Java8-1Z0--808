package ch03.objectlifecycle;

/*
 * An object is created when a reference variable is initialized by using the keyword new. But the String class is an
 * exceptional case here. String reference variables can also be initialized by using string literal values.
 */
public class Person {}
class ObjectLifeCycle {
    Person person; // declaring a reference variable of type Person
}

class ObjectLifeCycle2 {
    Person person = new Person(); // declaring and initializing a variable of type Person

    ObjectLifeCycle2() {
        new Person(); // an object of the class Person is created, but it can't be accessed using any reference variable.
    }
}

class ObjectLifeCycle3 {
    String obj1 = new String("eJava");
    String obj2 = "Guru";
}