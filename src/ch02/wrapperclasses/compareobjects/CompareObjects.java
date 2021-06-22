package ch02.wrapperclasses.compareobjects;

/*
 * The method equals() compares the values stored by wrapper instances.
 * The comparision operator == compares reference variables - checking whether they refer to the same instance
 *
 * Note: Objects of different wrapper classes with the same values are not equal.
 * Using equals() with such instances will return false.
 * Using == with such instances causes compilation error.
 *
 *
 */
public class CompareObjects {
    public static void main(String[] args) {
        //Integer i1 = new Integer(10);
        //Integer i2 = new Integer(10);

        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);

        Integer i5 = 10;
        Integer i6 = 10;

        System.out.println("Compare data using the comparison operator ==");
        //System.out.println(i1 == i2); // prints false
        System.out.println(i3 == i4);
        System.out.println(i4 == i5);
        System.out.println(i5 == i6);

        System.out.println("Compare data using the equals() method");
        //System.out.println(i1.equals(i2)); // prints true
        System.out.println(i3.equals(i4));
        System.out.println(i4.equals(i5));
        System.out.println(i5.equals(i6));

        Integer obj1 = 100;
        Short obj2 = 100;
        System.out.println(obj1.equals(obj2));
        //System.out.println(obj1 == obj2); // this code won't compile
    }
}
