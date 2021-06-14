package ch01.nonaccessmodifiers.fnl;

public class Person2 {
    // this code compiles successfully: the final variable assigned value once in the constructor
    final long MAX_AGE;
    Person2() {
        MAX_AGE = 99;
    }

    // this code won't compile: re-assignment not allowed
//    final long MAX_AGE = 90;
//    Person2() {
//        MAX_AGE = 99;
//    }
}
