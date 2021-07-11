package ch04.stringbuilder;

/*
 * When we append an object's value to a StringBuilder, the method append() calls the static String.valueOf() method.
 * If the object is null, then the four-letter string "null" is returned; otherwise, it calls its toString() method.
 * If the toString() method has been overridden by the class, then the method append() adds the String value returned by
 * it to the target StringBuilder object.
 * If the toString() method hasn't been overridden by the class, the default implementation of the method toString() in
 * the class Object returns the name of the class followed by the @ char and unsigned hexadecimal representation of the
 * hash code of the object (the value returned by the object's hashCode() method).
 */
public class AppendStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        sb1.append(new Person("Oracle"));
        System.out.println(sb1); // prints JavaPerson@xxxxxxx where xxxxxxx is the an unsigned hexadecimal generated in the hashCode() method of the Object class
    }
}

class Person {
    String name;

    Person(String str) {
        this.name = str;
    }
}
