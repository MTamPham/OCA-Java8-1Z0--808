package ch04.stringbuilder;

/*
 * We should use the class StringBuilder when we're dealing with larger strings or modifying the contents of a string often.
 * The StringBuilder class is mutable. Unlike String, the implementation of the class StringBuilder define a non-final
 * character array to store the sequence of characters.
 *
 * There are overloaded constructors to create an object of the class StringBuilder:
 * - Default constructor with no parameter creates an object with no characters in it and an initial capacity of 16 characters
 * - Constructor that accepts a parameter of type CharSequence creates an object containing the same set of specified characters
 * - Constructor that accepts a parameter of type int creates an object with no characters in it and an initial capacity
 * specified by the argument
 * - Constructor that accepts a parameter of type String creates an object with an initial value as contained by the
 * specified String argument
 */
public class CreateStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(sb1);
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder("Tam Pham");
    }
}
