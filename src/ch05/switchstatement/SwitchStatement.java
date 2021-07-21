package ch05.switchstatement;

/*
 * A switch statement can be used to compare the value of a variable with multiple values. For each of these values, we
 * can define a set of statements to execute.
 *
 * The difference between a switch statement and multiple if-else-if-else constructs is the if-else-if-else construct
 * evaluates all the conditions until it finds a match, whereas a switch compares the argument passed to it with its labels.
 *
 * A switch statement can define multiple case labels within its switch block but only a single default label. The default
 * label executes when no matching value is found in the case labels. A break statement is used to exit a switch statement,
 * after the code completes its execution for a matching case. An absence of the break statement fall through
 *
 * A switch statement accepts arguments of types char, byte, short, int, enum, Character, Byte, Short, Integer and String.
 * The switch statement doesn't accept arguments of type long, float, double, or any object besides String.
 * For non-primitive types, that is, String and wrapper types, the switch argument must not be null, which would cause a
 * NullPointerException to be thrown.
 *
 * Values passed to the label case of a switch statement
 * - The value of a case label must be a compile-time constant value; that is, the value should be known at the time of
 * code compilation.
 * - The variables which are marked final can be used in the expression because the value of final variables can't change
 * once they're initialized. It makes them compile-time constant values. However, if we don't assign a value to a final
 * variable with its declaration, it isn't considered a compile-time constant.
 * - Case values should be assignable to the argument passed to the switch statement; that is, switch argument and case
 * values should be of the same type.
 * - Null isn't allowed as a case label
 * - One code block can be defined for multiple cases; that is, it's acceptable to define a single block for multiple
 * case labels in a switch statement.
 *
 * The keyword break is used to exit the switch construct once a matching case is found. In the absence of the break
 * statement, control will fall through the remaining code and execute the code corresponding to all the remaining cases
 * that follow that matching case.
 */
public class SwitchStatement {
    public static void main(String[] args) {
        String day = "SUN";
        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
                System.out.println("Time to work");
            case "FRI":
                System.out.println("Nearing weekend");
            case "SAT":
            case "SUN":
                System.out.println("Weekend!");
            default:
                System.out.println("Invalid day?");
        }

        // case values should be compile-time constants
        int a = 10, b = 20, c = 30;
        switch (a) {
            // not allowed
//            case b + c:
//                System.out.println(b+c);
//                break;
            // allowed
            case 10 * 7:
                System.out.println(10 * 7512 + 10);
                break;
        }

        // the final variables are compile-time constant values
        final int x = 10;
        final int y = 20;
        final int z = 30;
        final int m;
        m = 40;
        switch (x) {
            case y + z:
                System.out.println(y + z);
                break;
            // not allowed
//            case m:
//                System.out.println(m);
//                break;
        }

        // this code won't compile, floating-point number can't be assigned to byte variable
//        byte myByte = 10;
//        switch (myByte) {
//            case 1.2:
//                System.out.println(1);
//                break;
//        }

        // null isn't allowed as a case label
        String name = "Paul";
        switch (name) {
            case "Paul":
                System.out.println(1);
                break;
            // not allowed
//            case null:
//                System.out.println("null");
        }


    }
}
