package ch02.operators.arithmetic;

/*
 * The operator covered in the exam topics are +, -, *, /, %, ++, --
 *
 * For arithmetic operations with data type char, byte, short, or int, all operand values are widened to int. If an
 * arithmetic operation includes the data type long, all operand values are widened to long. If an arithmetic operation
 * includes a data type of float or double, all operand values are widened to double.
 *
 * The operators ++ and -- are unary operators.
 * When these operators aren't part of an expression, the postfix and prefix notations behave in exactly the same manner.
 * When these operators are used in an expression, its replacement with respect to its operand decides whether its value
 * will increment of decrement before the evaluation of the expression or after the evaluation of the expression.
 *
 * Note:
 * - Unary increment and decrement operators can be used with variables but not with literal values. If do so, the code
 * won't compile.
 * - When we apply the operators to char values, their corresponding ASCII values are added and subtracted.
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        char char1 = 'a';
        System.out.println(char1); // prints a
        System.out.println(char1 + char1); // prints 194
        System.out.println(char1 - char1); // prints 0

        // The following code won't compile because two byte values are widened to int, not short.
//        byte age1 = 10;
//        byte age2 = 20;
//        short sum = age1 + age2;

        // But if we define the byte variables as final, the compiler is assured that their sum can be assigned to a
        // variable of type short, without any loss of precision
        final byte age1 = 10;
        final byte age2 = 20;
        short sum = age1 + age2;

        // prefix notation and postfix notation aren't part of an expression
        int a = 20;
        int b = 10;
        ++a;
        b++;
        System.out.println(a); // prints 21
        System.out.println(b); // prints 11

        // prefix notation in an expression
        int a2 = 20;
        int b2 = 10;
        int c2 = a2 - ++b2; // c2 = 20 - 11
        System.out.println(c2); // prints 9
        System.out.println(b2); // prints 11

        // postfix notation in an expression
        int a3 = 50;
        int b3 = 10;
        int c3 = a3 - b3++; // c3 = 50 - 10
        System.out.println(c3); // prints 40
        System.out.println(b3); // prints 11
    }
}
