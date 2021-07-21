package ch05.loopstatements;

/*
 * The break statement is used to exit - or break out of - the for, for-each, do, and do-while loops, as well as switch
 * constructs.
 */
public class Break {
    public static void main(String[] args) {
        String[] programmers = {"Paul", "Anna", "Juliet", "Harry"};
        for (String name : programmers) {
            System.out.println(name); // prints all programmer names
        }
        for (String name : programmers) {
            if ("Anna".equals(name))
                break;
            System.out.println(name); // prints Paul
        }
    }
}
