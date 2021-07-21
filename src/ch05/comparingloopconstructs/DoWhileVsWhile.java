package ch05.comparingloopconstructs;

/*
 * Both do-while and while loops execute a set of statements until their termination condition evaluates to false.
 *
 * The difference between these two statements is that the do-while loop executes the code at least once, even if the
 * condition evaluates to false. The do-while loop evaluates the termination condition after executing the statements,
 * whereas the while loop evaluates the termination condition before executing its statements.
 */
public class DoWhileVsWhile {
    public static void main(String[] args) {
        int num = 10;
        do {
            num++;
        } while (++num > 20);
        System.out.println(num); // prints 12

        num = 10;
        while (++num > 20) {
            num++;
        }
        System.out.println(num); // prints 11
    }
}
