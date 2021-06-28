package ch03.methods;

/*
 * The return type of a method states the type of value that a method will return. A method may or may not return a value.
 * One that doesn't return a value has a return type of void. A method can return a primitive value, an object of any class,
 * or an interface.
 * If a method doesn't return a value, we can't assign the result of that method to a variable.
 * If a method returns a value, the calling method may or may not bother to store the returned value from a method in a
 * variable.
 * The value that returned from a method must be assignable to the variable to which it's being assigned. For instance,
 * if the return value of a method is double, we can only assign the value to a variable of type double but not to a
 * variable of type int (without an explicit cast).
 */
public class Phone2 {
    double weight;

    void setWeight(double weight) {
        this.weight = weight;
    }

    double getWeight() {
        return this.weight;
    }
}

class TestMethods2 {
    public static void main(String[] args) {
        Phone2 p = new Phone2();
        // this code will compile
        double newWeight = p.getWeight();
        // this code won't compile because the type of the variable isn't compatible with the type of the returned value of the method
        //int newWeight2 = p.getWeight();
    }
}