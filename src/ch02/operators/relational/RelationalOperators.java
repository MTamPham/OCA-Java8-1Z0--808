package ch02.operators.relational;

/*
 * Relational operators are used to check conditions.
 * The operators <, <=, >, and >= can work with all types of integers, both integers (including char) and floating point.
 * The operators == and != can work with all types of primitives: char, byte, short, int, long, float, double, boolean.
 * The result of the relational operation is always a boolean value.
 *
 * Note: We can't compare incomparable values. For example, we can't compare a boolean with an int, a char, or a floating-point number.
 */
public class RelationalOperators {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        System.out.println(i1 >= i2); // prints false
        long long1 = 10;
        long long2 = 20;
        System.out.println(long1 <= long2); // prints true

        int a = 10;
        int b = 20;
        System.out.println(a == b); // prints false
        System.out.println(a != b); // prints true
        boolean b1 = false;
        System.out.println(b1 == true); // prints false
        System.out.println(b1 != true); // prints true
        System.out.println(b1 == false); // prints true
        System.out.println(b1 != false); // prints false
    }
}
