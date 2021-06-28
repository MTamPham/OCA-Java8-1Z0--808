package ch03.methods;

/*
 * A method is a group of statements identified with a name. Methods are used to define the behavior of an object.
 *
 * Components of a method:
 * - Return type
 * - Method parameters
 * - return statement
 * - Access modifiers
 * - Non-access modifiers
 *
 */
public class Phone {
    String model;
    double weight;

    // method that modifies an instance variable
    void setModel(String val) {
        model = val;
    }

    // method that only uses a method parameter
    void printVal(String val) {
        System.out.println(val);
    }

    // method that doesn't use a method parameter of instance variable and returns a string
    String todaysDate() {
        return new java.util.Date().toString();
    }

    // an example of a method that accepts method parameters and defines a return type and a return statement
    public boolean sendSMS(String phNum, String msg) {
        boolean msgSentStatus = false;
        if (send(phNum, msg)) {
            msgSentStatus = true;
        }
        return msgSentStatus;
    }

    boolean send(String phNum, String msg) {
        return true;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    double getWeight() {
        return this.weight;
    }
}

class TestMethods {
    public static void main(String[] args) {
        Phone p = new Phone();
        // this code won't compile because setWeight() doesn't return any value
        //double newWeight = p.setWeight(20.0);

        // this code is okay because the result of method getWeight() returns a value
        p.getWeight();
    }
}
