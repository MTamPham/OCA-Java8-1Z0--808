package ch05.forloop;

/*
 * A for loop is usually used to execute a set of statements a fixed number of times.
 * The for loop defines three types of statements separated with semicolons (;), as follows:
 * - Initialization block which executes only once
 * - Termination condition which can be only one for a for loop
 * - Update clause which executes after all the statements defined within the for loop body may define multiple statements;
 * that is, the update clause to be a last statement in the for loop.
 *
 * Initialization block:
 * - A for loop can declare and initialize multiple variables in its initialization block, but the variables it declares
 * should be of the same type.
 *
 * Termination condition:
 * - The termination condition is evaluated once for each iteration before executing the statements defined within the body
 * of the loop. The for loop terminates when the termination condition evaluates to false.
 *
 * Update clause:
 * - Code defined in the update clause executes after all the code defined in the body of the for loop. The statements
 * defined in the update clause will execute in the order in which they appear, at the end of all the statements defined
 * in the for block.
 *
 * All three parts of a for statement are optional. But they must be specified by including a semicolon; otherwise, the
 * the code won't compile.
 *
 * If a loop encloses another loop, they are called nested loops. The loop that encloses another loop is called the outer
 * loop, and the enclosed loop is called the inner loop.
 */
public class For {
    public static void main(String[] args) {
        int tableOf = 25;
        for (int ctr = 1; ctr <= 5; ctr++) {
            System.out.println(tableOf * ctr);
        }

        int ctr = 12;
        for (int j = 10, k = 14; // initialization section
             j <= k; // termination condition
             ++j, k = k-1, ctr--) { // update clause
            System.out.println(j + ":" + k + ":" + ctr);
        }

        // this code won't compile because we can't define variables of different types
//        for (int j = 10, long longVar = 10; j <= 1; ++j) { }

        // prints:
        // a
        // Happy
        // b
        // Happy
        String line = "ab";
        for (int i = 0; i < line.length(); ++i, printMethod()) {
            System.out.println(line.charAt(i));
        }

        // nested loops
        for (int hrs = 1; hrs <= 6; hrs++) {
            for (int min = 1; min <= 60; min++) {
                System.out.println(hrs + ":" + min);
            }
        }

        // optional parts of a for statement
        int a = 10;
        for (; a < 5; ++a) { // a for loop without initialization block
            System.out.println(a);
        }
        /*
        for (int b = 10; ; ++b) { // a for loop without termination condition, this implies infinite loop
            System.out.println(b);
        }
         */
    }

    private static void printMethod() {
        System.out.println("Happy");
    }
}
