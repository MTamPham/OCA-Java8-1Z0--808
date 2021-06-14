package ch01.accessmodifiers.prv.library;

/*
 * The private access modifier
 * The members of the class defined using the private access modifier are accessible only to the classes or interfaces
 * in which they are defined.
 */
public class Book {
    private void countPages() {}
    protected void modifyTemplate() {
        countPages();
    }
}
