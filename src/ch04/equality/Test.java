package ch04.equality;

/*
 * Any Java class can define a set of rules to determine whether its two objects should be considered equal.
 * The method equals() is defined in class java.lang.Object. All the Java classes directly or indirectly inherit this class.
 * The overridden version of method equals() should define a method parameter of type Object, and its return type is boolean.
 *
 * The Java API defines a contract for the equals() method, which should be taken care of when we implement it in any of
 * our classes. The equals method implements an equivalence relation on non-null object references:
 * - It is reflexive: for any non-null reference value x, x.equals(x) should return true.
 * - It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x)
 * returns true.
 * - It is transitive: for any non-null reference values x, y and z, if x.equals(y) returns true and y.equals(z) returns
 * true, then x.equals(z) should return true.
 * - It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return
 * true or consistently return false, provided no information used in equals() comparisons on the objects is modified.
 * - For any non-null reference value x, x.equals(null) should return false.
 */
class BankAccount {
    String acctNumber;
    int acctType;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            return (this.acctNumber.equals(b.acctNumber) && this.acctType == b.acctType);
        }
        return false;
    }

    // this will be considered as an overloaded method, not a overridden one and not be called in contains(), indexOf() or lastIndexOf()
    public boolean equals(BankAccount obj) {
        if (obj != null) {
            return (this.acctNumber.equals(obj.acctNumber) && this.acctType == obj.acctType);
        }
        return false;
    }
}

public class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 4;
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "11223344";
        b2.acctType = 3;
        BankAccount b3 = new BankAccount();
        b3.acctNumber = "11223344";
        b3.acctType = 3;
        System.out.println(b1.equals(b2)); // prints false because the values of the reference variables don't match
        System.out.println(b2.equals(b3)); // prints true because the values of the reference variables match each other
        System.out.println(b1.equals(new String("abc"))); // prints false because the method parameter passed to the method is not of type BankAccount
    }
}
