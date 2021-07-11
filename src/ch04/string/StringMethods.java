package ch04.string;

public class StringMethods {
    public static void main(String[] args) {
        // charAt() retrieves a character at a specified index of a String on which index starts from 0
        String name = new String("Paul");
        System.out.println(name.charAt(0)); // prints P
        System.out.println(name.charAt(2)); // prints u

        // indexOf() specifies if a char or String is found in the target. If it is found, the first matching position
        // is return; otherwise, it retunrs -1
        // By default, the method starts its search from the first char of the target String, but we can set the starting
        // position ourselves too.
        String letters = "ABCAB";
        System.out.println(letters.indexOf('B')); // prints 1
        System.out.println(letters.indexOf("S")); // prints -1
        System.out.println(letters.indexOf("CA")); // prints 2
        System.out.println(letters.indexOf('B', 2)); // prints 4

        // substring() can return a substring of a String from the position we specify to the end of the String.
        String exam = "Oracle";
        String sub = exam.substring(2);
        System.out.println(sub); // prints acle
        // substring() returns a substring of a String from the starting position to the end position we specify. Note
        // that the character at the end position isn't included
        String result = exam.substring(2, 4);
        System.out.println(result); // prints ac

        // trim() returns a new String by removing all the leading and trailing white space in a String. White spaces
        // are blanks (new lines, spaces, or tabs)
        String varWithSpaces = " AB CB    ";
        System.out.print(":");
        System.out.print(varWithSpaces);
        System.out.print(":"); // prints : AB CB    :
        System.out.println();
        System.out.print(":");
        System.out.print(varWithSpaces.trim());
        System.out.print(":"); // prints :AB CB:
        System.out.println();

        // replace() returns a new String by replaces all the occurrences of a char with another char, or a String with
        // another String but we can't mix the parameter types
        String letters2 = "ABCAB";
        System.out.println(letters2.replace('B', 'b')); // prints AbCAb
        System.out.println(letters2.replace("CA", "12")); // prints AB12B

        // length() returns the length of a String
        System.out.println("Tam".length()); // prints 3

        // startsWith() determines whether a String starts with a specified prefix, specified as a String
        String letters3 = "ABCAB";
        System.out.println(letters3.startsWith("AB")); // prints true
        System.out.println(letters3.startsWith("a")); // prints false
        System.out.println(letters3.startsWith("A", 3)); // prints true

        // endsWith() tests whether a String ends with a particular suffix
        System.out.println(letters3.endsWith("CAB")); // prints true
        System.out.println(letters3.endsWith("B")); // prints true
        System.out.println(letters3.endsWith("b")); // prints false

        // It's common to use multiple String methods in a single line of code. When chained, the methods are evaluated
        // from left to right
        String result2 = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
        System.out.println(result2); // prints SundayZZM n
    }
}
