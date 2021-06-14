package ch01.accessmodifiers.dft.library;

public class Librarian {
    public Librarian() {
        Book b = new Book();
        int c = b.issueCount;
        b.issueHistory();
    }
}
