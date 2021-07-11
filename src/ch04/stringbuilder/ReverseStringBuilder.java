package ch04.stringbuilder;

/*
 * The reverse() method reverses the sequence of characters of a StringBuilder.
 * Note that we can't use the reverse() to reverse a substring of StringBuilder.
 */
public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.reverse();
        System.out.println(sb1);
    }
}
