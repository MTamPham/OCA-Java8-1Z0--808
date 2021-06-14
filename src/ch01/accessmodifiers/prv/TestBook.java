package ch01.accessmodifiers.prv;

import ch01.accessmodifiers.prv.library.Book;

// The code fails to compile
public class TestBook {
    public static void main(String args[]) {
        Book b = new Book();
        b.countPages();
    }
}
