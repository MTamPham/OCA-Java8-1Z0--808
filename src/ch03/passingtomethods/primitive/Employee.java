package ch03.passingtomethods.primitive;

/*
 * The value of a primitive data type is copied and passed to a method. Hence, the variable whose value was copied
 * doesn't changed.
 */
public class Employee {
    int age;

    void modifyVal(int a) {
        a = a + 1;
        System.out.println(a);
    }
}

class Office {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.age); // prints 0
        e.modifyVal(e.age);
        System.out.println(e.age); // prints 0
    }
}
