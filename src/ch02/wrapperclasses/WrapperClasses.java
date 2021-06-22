package ch02.wrapperclasses;

/*
 * All the wrapper classes are immutable - classes that don't allow changes to the state of their instances after initialization.
 * All the wrapper classes implement the interfaces java.io.Serializable and java.lang.Comparable
 *
 * We can create objects of all the wrapper classes in multiple ways:
 * - Assignment - by assigning a primitive to a wrapper class variable
 * - Constructor - by using wrapper class constructors (Deprecated)
 * - Static methods - by calling static method of wrapper classes
 *
 * All wrapper classes (except Character) define a constructor that accepts a String argument representing the primitive
 * value that needs to be wrapped.
 * Character wrapper class define a constructor that accepts a char argument.
 * None of the wrapper classes define a non-argument constructor.
 *
 * To retrieve primitives values from the wrapper classes, use the <primitiveType>Value() method which is defined in all
 * wrapper classes.
 *
 * To parse a string value to a primitive type, use the parse<DataType>() method, where DataType refers to the type of
 * the return value.
 * Note: All parse methods (except parseBoolean()) throw NumberFormatException.
 */
public class WrapperClasses {
    Boolean bool1 = true;
    Character char1 = 'a';
    Byte byte1 = 10;
    Double double1 = 10.98;

    // deprecated
//    Boolean bool2 = new Boolean(true);
//    Character char2 = new Character('a');
//    Byte byte2 = new Byte((byte) 10);
//    Double double2 = new Double(10.98);

    Boolean bool3 = Boolean.valueOf(true);
    Character char3 = Character.valueOf('a');
    Byte byte3 = Byte.valueOf("10");
    Double double3 = Double.valueOf(10.98);
}
