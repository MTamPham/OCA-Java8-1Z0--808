package ch03.encapsulation;

/*
 * Encapsulation is the concept of defining variables and the methods together in a class to hide the information.
 *
 * A well-encapsulated object doesn't expose its internal parts to the outside world. It defines a set of methods that
 * enables the users of the class to interact with it.
 *
 * Quick list of reasons to encapsulate the state of a Java object:
 * - To prevent an external object from performing dangerous operations
 * - To hide implementation details, so that the implementation can change a second time without impacting other objects
 * - To minimize the chance of coupling
 */
public class Phone {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double val) {
        if (val >= 0 && val <= 1000) { // negative and weight over 1,000 not allowed
            this.weight = val;
        }
    }
}

class Home {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.setWeight(-12.23);
        System.out.println(ph.getWeight()); // prints 0.0
        ph.setWeight(77712.23);
        System.out.println(ph.getWeight()); // prints 0.0
        ph.setWeight(12.23);
        System.out.println(ph.getWeight()); // prints 12.23
    }
}