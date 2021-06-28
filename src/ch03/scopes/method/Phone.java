package ch03.scopes.method;

/*
 * The variables that accept values in a method signature are called method parameters.
 * They're accessible only in the method that defines them.
 */
public class Phone {
    private boolean tested;

    public void setTested(boolean val) { // method parameter val is accessible only in method setTested
        tested = val;
    }

    public boolean isTested() {
        val = false; // this line of code won't compile because variable val can't be accessed in method isTested
        return tested;
    }
}
