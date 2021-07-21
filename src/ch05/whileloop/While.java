package ch05.whileloop;

/*
 * A while loop is used to repeatedly execute a set of statements as long as its condition evaluates to true. This loop
 * checks the condition before it starts the execution of the statement.
 * The while loop accepts arguments of type boolean or Boolean.
 */
public class While {
    public static void main(String[] args) {
        // prints
        // 9
        // 8
        // 7
        int num = 9;
        boolean divisibleBy7 = false;
        while (!divisibleBy7) {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            --num;
        }

        // now let's change the variable to true and the code won't enter the loop because the condition isn't true
        num = 9;
        divisibleBy7 = true;
        while (!divisibleBy7) {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            --num;
        }
    }
}
