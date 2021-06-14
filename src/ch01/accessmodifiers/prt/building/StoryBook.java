package ch01.accessmodifiers.prt.building;

import ch01.accessmodifiers.prt.library.Book;

/*
 * The StoryBook inherits the protected members of its base class, irrespective of th package.
 * If the class tries to instantiate Book using a reference variable and then tries to access its protected members, the
 * code won't compile.
 */
public class StoryBook extends Book {
    public StoryBook() {
        author = "ABC";
        modifyTemplate();
    }

    // this code won't compile
//    public StoryBook() {
//        Book book = new Book();
//        book.author = "ABC";
//        book.modifyTemplate();
//    }
}
