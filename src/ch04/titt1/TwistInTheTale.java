package ch04.titt1;

// Compilation error because method startsWith() requires a parameter of type String, not a char type
public class TwistInTheTale {
    public static void main(String[] args) {
        String letters = "ABCAB";
        System.out.println(letters.substring(0, 2).startsWith('A'));
    }
}
