package ch04.stringbuilder;

/*
 * The method subSequence() retrieves a subsequence of a StringBuilder object but doesn't modify the existing value
 */
public class SubSequenceStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        System.out.println(sb1.subSequence(2, 4)); // prints 23
        System.out.println(sb1); // prints 0123456
    }
}
