package ch04.stringbuilder;

/*
 * The append() method adds the specified value at the end of the existing value of a StringBuilder object.
 * The methods accepts all the primitives, String, char array, and Object, as method parameters.
 */
public class AppendStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(true);
        sb1.append(10);
        sb1.append('a');
        sb1.append(20.99);
        sb1.append("Hi");
        System.out.println(sb1); // prints true10a20.99Hi

        StringBuilder sb2 = new StringBuilder();
        char[] name = {'J', 'a', 'v', 'a'};
        sb2.append(name, 1, 3); // starting with position 1 append 3 characters, position 1 inclusive
        System.out.println(sb2); // prints ava
    }
}
