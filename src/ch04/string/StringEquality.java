package ch04.string;

/*
 * The correct way to compare two String values for equality is to use the equals() method. This method returns a true
 * value if the object being compared to it isn't null, is a String object, and represents the same sequence of characters
 * as the object to which it's being compared.
 *
 * The == operator compares the reference variables whether the variables refer to the same object.
 * The != operator compares the inequality of objects referred to by String variables. It's the inverse of the operator ==.
 *
 * The String values returned by String methods aren't stored in the String pool because these strings are created using
 * the new operator.
 */
public class StringEquality {
    public static void main(String[] args) {
        String var1 = new String("Java");
        String var2 = new String("Java");
        System.out.println(var1.equals(var2)); // prints true
        System.out.println(var1 == var2); // prints false, they refer to the same object even if they have the same sequence of characters
        System.out.println(var1 != var2); // prints true

        String var3 = "code";
        String var4 = "code";
        System.out.println(var3.equals(var4)); // prints true
        System.out.println(var3 == var4); // prints true, they refer to the same object created and shared in the String pool
        System.out.println(var3 != var4); // prints false

        String lang1 = "Java";
        String lang2 = "JaScala";
        String returnValue1 = lang1.substring(0, 1);
        String returnValue2 = lang2.substring(0, 1);
        System.out.println(returnValue1 == returnValue2); // prints false
        System.out.println(returnValue1.equals(returnValue2)); // prints true
    }
}
