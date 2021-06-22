package ch02.primitivetypes;

/*
 * Primitive data types are the simplest data types in a programming language.
 * A variable defined as one of the primitive data types is a primitive variable.
 * char - an unsigned numeric data type to store a single 16-bit Unicode character
 * byte - a signed numeric data type to store whole numbers of size 8 bits (-128 to 127)
 * short - a signed numeric data type to store whole numbers of size 16 bits (-32,768 to 32,767)
 * int - a signed numeric data type to store whole numbers of size 32 bits (-2,147,483,648 to 2,147,483,647)
 * long - a signed numeric data type to store whole numbers of size 64 bits (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
 * float - a signed numeric data type to store decimal numbers of size 32 bits
 * double - a signed numeric data type to store decimal numbers of size 64 bits
 * boolean -
 *
 * The default type of a non-decimal number is int. To designate an integer literal value as a long value, add the suffix L or l (in lowercase).
 * For octal literals, use the prefix 0; for the binary, use the prefix 0B or 0b; and for hexadecimal, use the prefix 0X or 0x.
 *
 * The default type of a decimal number is double. To designate a decimal literal value as a float value, add the suffix F or f (in lowercase).
 *
 * We can use underscores to group individual digits or letters of literal values makes them more readable.
 * The underscore can be placed right after the prefix 0, which is used to define an octal literal value but not after
 * other prefixes 0B, 0b, 0X, 0x, which are used to define a binary literal value or hexadecimal literal value, and D, d,
 * F, f, which are used to define a double literal value or float literal value
 * The underscore can't be placed at the beginning or the end of a literal value
 * The underscore can't be placed prior to an L suffix, which is used to define a long literal value
 * The underscore can't be placed adjacent to a decimal point
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        // boolean usage
        boolean voucherPurchased = true;
        boolean examPrepStarted = false;

        // integers usage
        byte num = 100;
        short sum = 1240;
        int total = 48764;
        long population = 214748368;
        long fishInSea = 764398609800L;
        int baseDecimal = 267; // 267 in decimal number system
        int octVal = 0413; // 413 in octal number system which is equal to 267 in decimal number system
        int hexVal = 0x10B; // 10B in hexadecimal number system which is equal to 267 in decimal number system
        int binVal = 0b10001011; // 100001011 in binary number system which is equal to 267 in decimal number system
        long baseDecimal2 = 100_267_760;
        long octVal2 = 04_13;
        long hexVal2 = 0x10_BA_75;
        long binVal2 = 0b1_0000_10_11;

        // floating point (double) usage
        float average = 20.129F;
        float orbit = 1765.65f;
        double inclination = 120.1762;
        double inclination2 = 1.201762e2; // a literal value in scientific notation (1.201762e2 is same as 120.1762)

        // character usage
        char c1 = 'D'; // use single quotes to assign a char, not double quotes
        System.out.println("c1 = " + c1);
        char c2 = 122; // 122 is a number in base 10, which is equivalent to the letter "z" in ASCII table
        char c3 = '\u0122'; // \u0122 is a number in base 16, which is equivalent to a Unicode letter "Ģ"
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        // If we try to assign a negative number to a char variable, the code won't compile
        //char c4 = -122;
        // But if we forcefully assign a negative number to a char type by casting it to char, it complies successfully
        char c4 = (char) -122;
        System.out.println("c4 = " + c4);
    }
}
