package ch05.ifelseternaryconstructs;

/*
 * An if construct or an if statement enables us to execute a set of statements based on the result of a condition. The
 * condition must always evaluate to a boolean or a Boolean value.
 *
 * Multiple flavors of the if statement are:
 * - if
 * - if-else
 * - if-else-if-else
 *
 * Note for if-else-if-else construct:
 * - The last else statement is the part of the last if construct, not any of the if construct before it.
 * - The if-else-if-else is an if-else construct in which the else part define another if construct.
 * Therefore, to define an else for an outer if, use curly braces for the if code block.
 * It's important to determine to which if an else belongs. If no curly braces are given, start from the inside out with
 * the innermost if-else statement, matching each else with its nearest unmatched if statement.
 *
 * It's acceptable to not have the else blocks but it's not acceptable to have the else blocks without the if block or
 * the if code block. It's also acceptable to have the if construct with an empty code block or without the if block
 * and the else part.
 *
 * An if block will execute a single line of code if there are no braces but will execute an unlimited number of lines
 * if they're contained within a block (defined using braces).
 */
public class IfConstruct {
    public static void main(String[] args) {
        int score = 100;
        String result = "";
        String name = "Lion";

        // if flavor
        if (name.equals("Lion"))
            score = 200;

        // if-else flavor
        if (name.equals("Lion"))
            score = 200;
        else
            score = 300;

        // if-else-if-else flavor
        if (score == 100)
            result = "A";
        else if (score == 50)
            result = "B";
        else if (score == 10)
            result = "C";
        else
            result = "F";

        // this code is acceptable
        boolean testValue = false;
        if (testValue == true)
            System.out.println("value is true");

        // this code is acceptable
        if (testValue == true) {}
        else
            System.out.println("value is false"); // prints value is false

        // this code is acceptable
        if ((score = score + 10) > 110);

        // but this code won't compile
//        if (testValue == true)
//        else
//            System.out.println("value is false");

        // this only executes one line statement
        if (name.equals("Lion"))
            score = 200;

        // this executes multiple statements for an if construct
        if (name.equals("Lion")) {
            score = 200;
            name = "Larry";
        } else
            score = 129;
        System.out.println(name + ":" + score); // prints Larry:200
    }
}
