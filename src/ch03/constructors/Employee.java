package ch03.constructors;

/*
 * Constructors are special methods that create and return an object of the class in which they're defined. Constructors
 * have the same name as the class in which they're defined, and they don't specify a return type. If we define a return
 * type of a constructor, Java compiler will treat it as another method, not a constructor, which also implies that it
 * won't be called implicitly when we create an object of its class.
 *
 * A constructor can accomplish the following tasks:
 * - Call the superclass's constructor; this can be an implicit or explicit call
 * - Initialize all the instance variables of a class with their default values
 *
 * User-defined constructors are the ones defined by the author of the class.
 * Default constructors are given by the Java compiler when a class doesn't have any constructors. The accessibility of
 * a default constructor matches the accessibility of its class. It creates a public default constructor for a public class.
 * It creates a default constructor with package access for a class with package-level access.
 */
public class Employee {
    String name;
    int age;

    Employee() {
        age = 20;
        System.out.println("Constructor");
    }
}

class Employee2 {
    String name;
    int age;

    Employee2(int newAge, String newName) {
        this.age = newAge;
        this.name = newName;
        System.out.println("Constructor");
    }
}

class Employee3 {
    String name;
    int age;

    // this code will compile and be treated as a regular method, not a constructor
    void Employee() {
        System.out.println("Constructor");
    }
}

class Employee4 {
    void Employee() {
        System.out.println("not a Constructor now");
    }
}

class Employee5 {
    /*
     * An initializer block is defined within a class, not as a part of a method. It executes for every object that's
     * created for a class. Initializer blocks are used to initialize the variables of anonymous classes. An anonymous
     * class is a type of inner class. In the absence of a name, anonymous classes can't define a constructor and rely on
     * an initializer block to initialize their variables upon the creation of an object of their class.
     *
     * If we define both an initializer and a constructor for a class, both of these will execute. The initializer block
     * will execute prior to the constructor.
     *
     * If a class defines multiple initializer blocks, their order of execution depends on their placement in a class.
     * But all of them execute before the class's constructor
     */
    {
        System.out.println("Employee:initializer 1");
    }

    Employee5() {
        System.out.println("Employee:constructor");
    }

    {
        System.out.println("Employee:initializer 2");
    }
}

class Employee6 {
    String name;
    int age;

    /*
     * It's common to define multiple constructors in a class and re-use their functionality across constructors. To
     * invoke an overloaded constructor from another constructor, we use the keyword "this" - an implicit reference
     * that's accessible to all objects that refer to an object itself.
     * When we invoke an overloaded constructor using the keyword this, it must be the first statement in the constructor.
     */
    Employee6() {
        this(null, 0);
        System.out.println("No-argument constructor");

        // this code won't compile, the call to the overloaded constructor must be the first statement in a constructor
//        System.out.println("No-argument constructor");
//        this(null, 0);
    }

    Employee6(String newName) {
        this.name = newName;
        this.age = 25;
    }

    Employee6(int newAge, String newName) {
        this.name = newName;
        this.age = newAge;
    }

    Employee6(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }
}

class Office {
    public static void main(String[] args) {
        Employee emp = new Employee(); // constructor is called on object creation
        System.out.println(emp.age);

        Employee2 emp2 = new Employee2(29, "Tam Pham");

        Employee3 emp3 = new Employee3();

        Employee4 emp4 = new Employee4();
        emp4.Employee();

        Employee5 emp5 = new Employee5();
    }
}
