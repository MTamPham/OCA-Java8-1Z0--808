package ch05.loopstatements;

/*
 * Labels can be added to the following types of statements:
 * - A code block defined using {}
 * - All looping statements (for, enhanced for, while, do-while)
 * - Condition constructs (if and switch statement)
 * - Expressions
 * - Assignments
 * - return statements
 * - try blocks
 * - throws statements
 */
public class Label {
    public static void main(String[] args) {
        String[] programmers = {"Outer", "Inner"};
        outer:
        for (String outer : programmers) {
            for (String inner : programmers) {
                if ("Inner".equals(inner))
                    break outer; // exits the outer loop, marked with label outer
                System.out.println(inner + ":");
            }
        }

        outer2:
        for (String name1 : programmers) {
            for (String name : programmers) {
                if ("Inner".equals(name))
                    continue outer2; // skip remaining code for current iteration of outer loop and starts with its next iteration
                System.out.println(name); // prints Outer two times
            }
        }

        // this code won't compile because labels can't be added to variable declaration
        outer:
//        int[] myArray = {1, 2, 3};

        // but the code will compile if the declaration enclosed within a block statement
        aLabel: {
            int[] myArray = {1, 2, 3};
        }
    }
}
