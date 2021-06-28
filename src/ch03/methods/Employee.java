package ch03.methods;

/*
 * Method parameters are the variables that appear in the definition of a method and specify the type and number of values
 * that a method can accept. Method arguments are the actual values that are passed to a method while executing it.
 * A method may accept zero or multiple method arguments.
 * We can define a parameter that can accept variable arguments (varargs) in methods. The ellipsis (...) that follows
 * the data type indicates that the method parameter may be passed an array or multiple comma-separated values. We can
 * define only one variable arguments in a parameter list, and it must be the last variable in the parameter list.
 */
public class Employee {
    // this code won't compile, we can't define multiple variables that can accept variable arguments
    public int daysOffWork(String... months, int... days) {
        int daysOff = 0;
        for (int i = 0; i < days.length; i++) {
            daysOff += days[i];
        }
        return daysOff;
    }

    // this code won't compile, the variable argument must be the last in the parameter list
    public int daysOffWork(int... days, String year) {
        int daysOff = 0;
        for (int i = 0; i < days.length; i++) {
            daysOff += days[i];
        }
        return daysOff;
    }
}
