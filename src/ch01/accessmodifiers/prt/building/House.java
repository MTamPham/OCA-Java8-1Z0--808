package ch01.accessmodifiers.prt.building;

import ch01.accessmodifiers.prt.library.Book;

/*
 * The code fails to compile since the members of Book are defined as protected
 */
public class House {
    public House() {
        Book book = new Book();
        book.author = "ABC";
        book.modifyTemplate();
    }
}
