package ch03.methods;

/*
 * A return statement is used to exit from a method, with or without a value. For methods that define a return type, the
 * return statement must be immediately followed by a return value. For methods that don't return a value, the return
 * statement can be used without a return value to exit a method.
 * The return statement must be the last statement to execute in a method, if present.
 */
public class Phone3 {
    double weight;

    void setWeight(double val) {
        if (val < -1) {
            return; //control exits the method if this condition is true
        }
        this.weight = val;
    }

    // this code won't compile, the return statement must be the last statement to execute in a method
//    void setWeight(double val) {
//        return;
//        this.weight = val;
//    }
}
