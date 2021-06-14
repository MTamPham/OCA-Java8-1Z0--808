package ch01.accessmodifiers.pub.building;

import ch01.accessmodifiers.pub.library.Book;

public class House {
    public House() {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
    }
}
