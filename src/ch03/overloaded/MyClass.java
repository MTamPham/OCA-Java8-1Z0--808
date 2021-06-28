package ch03.overloaded;

/*
 * Overloaded methods are methods in the same class with the same name but different method parameter lists.
 *
 * Overloaded methods must have method parameters different from one another. The argument lists can differ in terms of
 * any of the following:
 * - Change in the number of parameters that are accepted
 * - Change in the types of parameters that are accepted
 * - Change in the positions of the parameters that are accepted (based on parameter type, not variable names)
 * However, we can't define overloaded methods by just switching an array parameter into a vararg or vice versa (unless
 * the vararg or array item doesn't remain the same).
 *
 * Overloaded methods may or may not define a different return type.
 * Overloaded methods may or may not define different access levels.
 * Overloaded methods can't be defined by only changing their return type or access modifiers or both.
 */
public class MyClass {
    double calcAverage(int marks1, double marks2) {
        return (marks1 + marks2) / 2.0;
    }

    // this code will compile because the parameter list is different
    double calcAverage(char marks1, char marks2) {
        return (marks1 + marks2) / 2.0;
    }

    // this code will compile because the positions of parameters are changed
    double calcAverage(double marks1, int marks2) {
        return (marks1 + marks2) / 2.0;
    }

    // this code won't compile, we just switch an array into a vararg that isn't considered overloaded methods
//    double calcAverage(int[] marks) {
//        return 0.0;
//    }
//
//    double calcAverage(int... marks) {
//        return 0.0;
//    }

    // this code won't compile because they differ only in their return types
//    double calcAverage(int marks1, int marks2) {
//        return (marks1 + marks2) / 2.0;
//    }
//
//    int calcAverage(int marks1, int marks2) {
//        return (marks1 + marks2) / 2;
//    }

    // this code won't compile because they differ only in their access levels
//    public double calcAverage(int marks1, int marks2) {
//        return (marks1 + marks2) / 2.0;
//    }
//
//    private double calcAverage(int marks1, int marks2) {
//        return (marks1 + marks2) / 2.0;
//    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        // this code won't compile because the compiler can't determine which overloaded method calcAverage() should be called
//        myClass.calcAverage(2, 3);
    }
}
