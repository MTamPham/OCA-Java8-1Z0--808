package ch01.accessmodifiers.prv.library;

// The code fails to compile although it derives the class Book since countPages() method is defined as private
public class CourseBook extends Book {
    public CourseBook() {
        countPages();
    }
}
