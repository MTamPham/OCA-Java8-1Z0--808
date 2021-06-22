package ch02.titt4;

public class TwistInTheTalesLogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 40;
        System.out.println(a++ > 10 || ++b < 30); // prints true, b = 21
        System.out.println(a > 90 && ++b < 30); // print false, the second operand isn't evaluated, b remains 21
        System.out.println(!(c > 20) && a == 10); // print false, the second operand isn't evaluated
        System.out.println(a >= 99 || a <= 33 && b == 10); // prints false
        System.out.println(a >= 99 && a <= 33 || b == 10); // print false, the second and third operand aren't evaluated
    }
}
