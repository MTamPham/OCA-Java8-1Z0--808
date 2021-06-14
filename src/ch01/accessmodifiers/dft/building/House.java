package ch01.accessmodifiers.dft.building;

import ch01.accessmodifiers.dft.library.Book;

// The code fails to compile since the members of Book class are defined as default access
public class House {
    public House() {
        Book b = new Book();
        int c = b.issueCount;
        b.issueHistory();
    }
}
