package ch03.scopes.instance;

/*
 * An instance variable is declared within a class, outside all the methods. It can be accessed by all the methods of the
 * class.
 */
public class Phone {
    private boolean tested;

    public void setTested(boolean val) {
        tested = val;
    }

    public boolean isTested() {
        return tested;
    }
}
