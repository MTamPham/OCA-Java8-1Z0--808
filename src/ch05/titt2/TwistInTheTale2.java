package ch05.titt2;

// The submission of Harry is correct because the switch statement doesn't accept a value of type long
public class TwistInTheTale2 {
    public static void main(String[] args) {
        // submission by Harry
        long dayCount = 31;
        if (dayCount == 28 || dayCount == 29)
            System.out.println("Feb");
        else if (dayCount == 30)
            System.out.println("Apr");
        else if (dayCount == 31)
            System.out.println("Jan");

        // submission by Selvan
//        long dayCount = 31;
//        switch (dayCount) {
//            case 28:
//            case 29:
//                System.out.println("Feb");
//                break;
//            case 30:
//                System.out.println("Apr");
//                break;
//            case 31:
//                System.out.println("Jan");
//                break;
//        }
    }
}
