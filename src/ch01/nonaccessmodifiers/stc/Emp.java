package ch01.nonaccessmodifiers.stc;

/*
 * The static modifier
 *
 * The modifier can be applied to the declarations of variables, methods, classes and interfaces.
 *
 * Static variables and methods belong to a class, not to any instance. Think of it as a common thing to all instances of
 * a class i.e. the static variables and methods are shared by all the objects of a class.
 * They can be accessed using the name of the class or the name of a reference object variable.
 *
 * Non-static variables and methods can access static variables and methods but static variables and methods cannot access
 * the non-static variables and methods.
 *
 * The non-private static variables and methods are inherited by derived classes.
 *
 * We can't prefix the definition of a top-level class or an interface with the keyword "static"
 */
public class Emp {
    String name;
    static int bankVault;
}

// this code won't compile because the static variable tries to call an instance method
//class MyClass {
//    static int x = count();
//    int count() {
//        return 10;
//    }
//}

// this code complies successfully
class MyClass {
    static int x = result();
    static int result() {
        return 20;
    }
    int nonStaticResult() {
        return result();
    }
}
