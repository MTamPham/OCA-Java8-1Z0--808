package ch05.ifelseternaryconstructs;

/*
 * A ternary operator, ?:, is a compact if-else construct, used to assign a value to a variable depending on a boolean
 * expression.
 *
 * All three part of a ternary operator are mandatory:
 * - The boolean expression
 * - The value returned if the boolean expression evaluates to true
 * - The value returned if the boolean expression evaluates to false
 *
 * Note:
 * The parentheses enclosing a boolean expression are optional and are used for better readability.
 * The value returned by a ternary operator must be assigned to a variable.
 * A ternary operator can't include code blocks.
 * The compatibility of the value that's returned by a ternary operator and the variable to which it's assigned is important.
 *
 * In nested ternary constructs, to determine which value belongs to which operator, split and indent a ternary construct
 * into its components.
 */
public class TernaryConstruct {
    public static void main(String[] args) {
        int bill = 2000;
        int discount = (bill > 2000) ? 15 : 10;
        System.out.println(discount); // prints 10

        // variable isn't declared in the ternary statement
        int discount2;
        discount2 = (bill > 2000) ? 15 : 10;
        System.out.println(discount2); // prints 10

        // assign expression to variable
        int discount3 = (bill > 2000) ? bill - 150 : bill - 100;
        System.out.println(discount3); // prints 1900

        // a method that returns a value can also be used to initialize a variable in a ternary construct
        int discount4 = (bill > 2000) ? getSpecDisc() : getRegDisc();
        System.out.println(discount4); // prints 11

        // this code won't compile because the returned value isn't assigned to a variable
//        (5000 > 2000) ? 15 : 10;

        // this code won't compile because the ternary operator can't include code blocks
//        int discount5 = (bill > 2000) ? {bill - 150} : {bill - 100};

        // this code won't compile because bill2 - 100 is of type long and discount6 variable is of type int
//        long bill2 = 2000;
//        int discount6 = (bill2 > 2000) ? bill2 - 100 : bill2 - 50;

        // this code won't compile because Integer can't be assigned to Long and vice versa
//        Long discount7 = (5000 > 2000) ? Integer.valueOf(10) : Integer.valueOf(15);

        // nested ternary constructs and apply the indentation technique to determine to which returned values belong
        int bill3 = 2000;
        int qty = 10;
        int discount8 = (bill3 > 1000) ? // the boolean expression ends with ?
                            (qty > 11) ? // nested ternary operator with three components
                                10
                                : 9
                            : 5; // the else part of the main ternary construct
        System.out.println(discount8); // prints 9
    }

    private static int getRegDisc() {
        return 11;
    }

    private static int getSpecDisc() {
        return 15;
    }
}
