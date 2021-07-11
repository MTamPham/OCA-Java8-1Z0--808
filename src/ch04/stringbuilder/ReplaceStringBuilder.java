package ch04.stringbuilder;

/*
 * Unlike the replace() method defined in the class String, the replace() method in the class StringBuilder replaces a
 * sequence of characters, identified by their positions, with another String
 */
public class ReplaceStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.replace(2, 4, "ABCD");
        System.out.println(sb1); // prints 01ABCD456
    }
}
