package ch02.identifiers;

/*
 * Identifiers are names of packages, classes, interfaces, methods and variables.
 * The identifiers can start with a letter, a currency sign, or an underscore.
 * The identifiers can use digit but not at the starting position.
 * We can't define identifiers with the same names as Java keywords or reserved words.
 * We can't use special characters in the identifiers.
 * The identifiers can't start with a Java digit.
 */
public class Identifiers {
    static int Constant = 10;

    public static void main(String[] args) {
        // valid identifiers
        Object customerValueObject = null;
        double $rate = 7.8;
        double _sine = 0.0;
        boolean happy2Help = true;
        Object nullValue = null;

        // invalid identifiers
//        char 7word = '7';
//        Object null = null;
//        int Digital!;
    }
}
