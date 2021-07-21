package ch05.dowhileloop;

/*
 * A do-while loop is used to repeatedly execute a set of statements until the condition that it uses evaluates to false.
 * This loop checks the condition after it completes the execution of all the statements in its loop body.
 * The do-while loop accepts arguments of type boolean and Boolean.
 * The do-while loop executes once, even though the condition specified in the do-while loop evaluates to false because
 * the condition is evaluated at the end of execution of the loop body.
 */
public class DoWhile {
    public static void main(String[] args) {
        // prints
        // 9
        // 8
        // 7
        int num = 9;
        boolean divisibleBy7 = false;
        do {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            num--;
        } while (divisibleBy7 == false);

        // now let's change the variable to true and the loop will execute once
        // prints 9
        num = 9;
        divisibleBy7 = true;
        do {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            num--;
        } while (divisibleBy7 == false);
    }
}
