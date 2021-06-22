package ch02.operators.logical;

/*
 * Logical operators are used to evaluate one or more expression.
 * The AND (&&) operator evaluates to true if all operands are true; false otherwise.
 * The OR (||) operator evaluated to true if any of all the operands are true.
 * The NOT (! - negation) operator reverses the outcome of a boolean value.
 * The result of the logical operator should be a boolean value.
 *
 * The logical AND and OR are short-circuit operators.
 * For the logical AND, if the first operand to this operator evaluates to false, the operator does not evaluate the second operand.
 * For the logical OR, if the first operand to this operator evaluates to true, the operator does not evaluate the second operand.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > 20 && b > 10); // prints false
        System.out.println(a > 20 || b > 10); // prints true
        System.out.println(! (b > 10)); // prints false
        System.out.println(! (a > 20)); // print true

        int marks = 8;
        int total = 10;
        System.out.println(total < marks && ++marks > 5); // print false, the first condition evaluates to false, the second condition isn't even evaluated
        System.out.println(marks); // print 8
        System.out.println(total == 10 || ++marks > 10); // print true
        System.out.println(marks); // print 8
    }
}
