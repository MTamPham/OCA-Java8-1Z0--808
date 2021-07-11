package ch04.string;

/*
 * Concatenation operators (+ and +=) can be used to concatenate two String values. The operators enable us to create a
 * new object of the class String with a value equal to the concatenated values of multiple Strings.
 *
 * When we use += to concatenate String values, ensure that the variable we're using has been initialized (and doesn't
 * contain null); otherwise it will return an unexpected output.
 */
public class StringOperators {
    public static void main(String[] args) {
        String aString = "OCJA" + "Cert" + "Exam";

        // The expression is evaluated from left to right. The former part does an add operation between two int values,
        // the latter part concatenates the String
        int num = 10;
        int val = 12;
        String aStr = "OCJA";
        String anotherStr = num + val + aStr;
        System.out.println(anotherStr); // prints 22OCJA
        // To treat the int variables as a String values, modify the expression as follows
        anotherStr = "" + num + val + aStr;
        System.out.println(anotherStr);

        String lang = "Java";
        lang += " is everywhere";
        System.out.println(lang); // prints Java is everywhere
        String initializedToNull = null;
        initializedToNull += "Java";
        System.out.println(initializedToNull); // prints nullJava
    }
}
