package ch01.nonaccessmodifiers.fnl;

/*
 * The final modifier
 *
 * The final modifier can apply to a class, variable or method.
 * A class that's marked final can't be extended by another class.
 * A final variable can't be re-assigned a value.
 * A final method defined in a base class can't be overridden by a derived class.
 */
final class Person {
}

// This code won't be compile because Person is defined as final
class Professor extends Person {
}