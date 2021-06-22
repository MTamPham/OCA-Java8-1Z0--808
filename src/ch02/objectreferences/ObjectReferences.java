package ch02.objectreferences;

/*
 * Objects are instances of classes.
 * An object reference is a memory address that points to a memory area of an object it refers to.
 * The literal value for all types of object reference variables is null.
 *
 * Differences between primitive variables and reference variables:
 * - Primitive variables store the actual values, whereas reference variables store the addresses of the objects they
 * refer to.
 * - To compare primitive variables, use the == operator. To compare reference variables whether they are pointing to
 * the same instance, use the == operator but to compare the objects the reference variables refer to, use the equals() method.
 * - There are 8 types of primitives, whereas there is no limit to the types of classes.
 * - Methods can change the state of primitives, whereas methods can change the state or assign a new object to reference variables.
 * - Primitives has different literal values for different types, whereas there is only one literal value for all types
 * of reference variables: null.
 * - Primitive variables aren't marked for garbage collections, whereas the object is reclaimed by the garbage collection
 * if there are no reference variables refer to it any longer.
 * - Primitive variables can work with Java operators, whereas reference variables can't.
 */
public class ObjectReferences {
    // A new Person object is created (in the heap)
    // A variable named "person" is created in the stack with an empty (null) value
    // The variable "person" is assigned the memory address where the object is located
    Person person = new Person();
}

class Person {}