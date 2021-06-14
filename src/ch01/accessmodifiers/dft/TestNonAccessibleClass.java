package ch01.accessmodifiers.dft;
import ch01.accessmodifiers.dft.test.NonAccessibleClass;

// This code won't compile because NonAccessibleClass is a non-public class that cannot be accessed outside a package.
public class TestNonAccessibleClass {
    public static void main(String args[]) {
        NonAccessibleClass c = new NonAccessibleClass();
        c.name = "ABC";
    }
}
