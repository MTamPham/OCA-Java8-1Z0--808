package ch04.stringbuilder;

/*
 * The method delete() removes the characters in a substring of the specified StringBuilder.
 * The method deleteCharAt() removes the char at the specified position.
 */
public class DeleteStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.delete(2, 4); // removes characters at positions starting from 2 to 4, excluding 4
        System.out.println(sb1); // prints 01456

        StringBuilder sb2 = new StringBuilder("0123456");
        sb2.deleteCharAt(2);
        System.out.println(sb2); // prints 013456
    }
}
