package ch01.nonaccessmodifiers.abst;

/*
 * The abstract modifier
 *
 * Nonaccess modifiers change the default behavior of a Java class and its members.
 * The abstract modifier can apply to a class, interface or method.
 *
 * An abstract class can't be instantiated. Also, an abstract class may or may not define an abstract method. But a concrete
 * class can't define an abstract method.
 *
 * An interface is an abstract entity by default.
 *
 * An abstract method doesn't have a body and usually implemented by a derived class.
 *
 */
public abstract class Person {
    private String name;
    public void displayName() {}
    public abstract void perform(); // This is an abstract method. It isn't followed by {}.
}

// The following definition are the same:
interface Movable {}
//abstract interface Movable {}
