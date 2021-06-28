package ch03.scopes.local;

/*
 * Local variables are defined within a method. Typically, we'd use local variables to store the intermediate results of
 * a calculation.
 * The lifespan of a local variable is limited to the method where it is defined.
 * A local variable must be declared before it is accessed.
 */
public class Student {
    private double marks1, marks2, marks3;
    private double maxMarks = 100;

    public double getAverage() {
        double avg = 0;
        avg = ((marks1 + marks2 + marks3) / (maxMarks * 3)) * 100;
        return avg;
    }

    public void setAverage(double val) {
        avg = val; // this code won't compile because avg is inaccessible outside the method getAverage
    }

    public void forwardReference() {
        int a = b; // won't compile since b is not declared yet
        int b = 20;
    }

    // this code compiles successfully
    public void noForwardReference() {
        int b = 20;
        int a = b;
    }
}

class Student2 {
    private double marks1, marks2, marks3;
    private double maxMarks = 100;

    public double getAverage() {
        if (maxMarks > 0) {
            double avg = 0; // in this case the avg is defined in if block
            avg = ((marks1 + marks2 + marks3) / (maxMarks * 3)) * 100;
            return avg;
        } else {
            avg = 0; // variable avg can't be accessed in the else block since the variable is local to the if block
            return avg;
        }
    }
}
