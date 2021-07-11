package ch04.string;

/*
 * A string object can be created by either using the new operator or by using String literal values (values within
 * double quotes).
 * The new operator creates a new object every time, even if two objects can have the same sequence of characters.
 * Meanwhile, if we use assignment operator, before an object is created, Java compiler searches for an object in similar
 * contents. If no match found, Java compiler creates an object and stores in it the String constant pool. Otherwise, the
 * matching object is returned.
 *
 * There are other several ways to create a String object:
 * - A String object can be created by enclosing a value within double quotes.
 * - A String object can be created by invoking other overloaded constructors of the class String such as from an array
 * of characters, from a StringBuilder, or from a StringBuffer
 *
 * The class String is immutable that means once created, the content of an object of the class can never be modified.
 * The immutability of String objects helps the JVM re-use String objects, reducing memory overhead and increasing performance.
 * String objects can be shared across multiple reference variables without any fear of changes in their values.
 * To implement the immutability of the String class, the class authors have implemented the following:
 * - The class String stores its value in a private variable of the type char array (char[] value). Arrays are fixed in
 * size and don't grow once initialized.
 * - The class String marks the variable that used to store its value as final.
 * - None of the methods defined in the class String modifies the char array. They return a new String object with the
 * modified value rather than modify the existing value.
 */
public class CreateString {
    public static void main(String[] args) {
        String str1 = new String("Paul");
        String str2 = new String("Paul");
        System.out.println(str1 == str2); // prints false

        String str3 = "Harry";
        String str4 = "Harry";
        System.out.println(str3 == str4); // prints true

        System.out.println("Morning"); // create a String object by enclosing a value within double quotes
        String str5 = "Morning";
        System.out.println(str5 == "Morning"); // prints true

        String girl = new String("Shreya");
        char[] name = new char[]{'P', 'a', 'u', 'l'};
        String boy = new String(name);
        StringBuilder sd1 = new StringBuilder("String Builder");
        String str6 = new String(sd1);
        StringBuffer sb1 = new StringBuffer("String Buffer");
        String str7 = new String(sb1);
    }
}
