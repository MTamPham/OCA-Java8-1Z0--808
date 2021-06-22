package ch02.operators.assignment;

/*
 * The assignment operator = is used to initialize variables and to reassign new values to them.
 * The +=, -=, *=, /= operator are short forms of addition, subtraction, multiplication, and division with assignment.
 *
 * Compiler doesn't allow us assign a bigger range of values into a variable with smaller range. But we can make it work by
 * explicitly casting the bigger value to a smaller value. However, it can produce unexpected results.
 *
 * Note: We can't use assignment operators to assign a boolean value to variables of type char, byte, short, int, long,
 * float, or double, or vice versa.
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        double myDouble2 = 10.2;
        int a = 10;
        int b = a;
        float float1 = 10.2F;
        float float2 = float1;

        b += a;
        a = b = 10;
        b -= a;
        a = b = 10;
        b *= a;
        a = b = 10;
        b /= a;
    }
}
