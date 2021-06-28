package ch03.scopes.clazz;

/*
 * A class variable is defined by using the keyword static. A class variable belongs to a class, not to individual objects
 * of the class. A class variable is shared across all objects - objects don't have a separate copy of the class variables.
 */
public class Phone {
    static boolean softKeyboard = true;
}
