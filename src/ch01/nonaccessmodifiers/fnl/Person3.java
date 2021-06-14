package ch01.nonaccessmodifiers.fnl;

public class Person3 {
    final void sing() {
        System.out.println("la..la..la..");
    }
}

class Professor extends Person3 {
    // This line of code won't compile, the sing() method can't be overridden as it is defined as final
    void sing() {
        System.out.println("Alpha.. beta.. gamma");
    }
}
