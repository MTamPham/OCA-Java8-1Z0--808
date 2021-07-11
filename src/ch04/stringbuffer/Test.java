package ch04.stringbuffer;

/*
 * The classes StringBuffer and StringBuilder offer the same functionality, with one difference: the methods of the class
 * StringBuffer are synchronized where necessary, whereas the methods of the class StringBuilder aren't.
 * When you work with the class StringBuffer, only one thread out of multiple threads can execute your method. This
 * arrangement prevents any inconsistencies in the values of the instance variables that are modified by these methods.
 * But it introduces additional overhead, so working with synchronized methods and the StringBuffer class affects the
 * performance of your code.
 */
public class Test {
}
