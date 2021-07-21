package ch05.titt4;

// This code's output is Outer:Outer:
public class TwistInTheTale4 {
    public static void main(String[] args) {
        String[] programmers = {"Outer", "Inner"};
        for (String outer : programmers) {
            for (String inner : programmers) {
                if ("Inner".equals(inner))
                    break;
                System.out.print(inner + ":");
            }
        }
        System.out.println();
    }
}
