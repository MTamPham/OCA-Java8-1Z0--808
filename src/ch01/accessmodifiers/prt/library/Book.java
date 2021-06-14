package ch01.accessmodifiers.prt.library;

/*
 * Protected access modifier
 * The members of the class are accessible to:
 * - Classes and interfaces defined in the same package
 * - All derived classes, even if they're defined in separate package
 */
public class Book {
    protected String author;
    protected void modifyTemplate() {}
}
