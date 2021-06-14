package ch01.accessmodifiers.prt.library;

public class Librarian {
    public Librarian() {
        Book book = new Book();
        book.author = "ABC";
        book.modifyTemplate();
    }
}
