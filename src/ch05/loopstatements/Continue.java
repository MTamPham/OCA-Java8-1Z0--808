package ch05.loopstatements;

/*
 * The continue statement is used to skip the remaining steps in the current iteration and start with the next loop
 * iteration.
 */
public class Continue {
    public static void main(String[] args) {
        String[] programmers = {"Paul", "Anna", "Juliet", "Harry"};
        for (String name : programmers) {
            if ("Anna".equals(name))
                continue;
            System.out.println(name); // prints all except Anna
        }
    }
}
