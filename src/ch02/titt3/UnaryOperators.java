package ch02.titt3;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        a = ++a + a + --a - --a + a++;
        System.out.println(a); // prints 32
    }
}
