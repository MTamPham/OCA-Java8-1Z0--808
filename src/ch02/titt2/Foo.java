package ch02.titt2;

// Can't assign 'false' to a boolean variable

public class Foo {
    public static void main(String[] args) {
        boolean b1, b2, b3, b4, b5, b6;
        b1 = b2 = b3 = false;
        // the following code won't compile because boolean can't be assigned a literal value other than true or false
//        b4 = 0;
//        b5 = 'false';
//        b6 = yes;
    }
}
