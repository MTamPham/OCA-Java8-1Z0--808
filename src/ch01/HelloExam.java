package ch01;

/*
 * The main method should comply with the following rules:
 * 1. The method must be marked as a public method
 * 2. The method must be marked as a static method
 * 3. The name of the method must be main
 * 4. The return type of this method must be void
 * 5. The method must accept a method argument of a String array or a variable argument (varargs) of type String.
 */

/*
 * To define a variable argument variable, the ellipsis (...) must follow the type of the variable and not the variable itself
 * public static void main(String... args)
 */

/*
 * NOTE: The placement of the keywords public and static are interchangeable but public static is more common
 */

public class HelloExam {
    public static void main(String args[]) {
        System.out.println("Hello exam");
        if (args.length >= 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
    }
}
