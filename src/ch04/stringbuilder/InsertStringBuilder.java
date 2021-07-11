package ch04.stringbuilder;

/*
 * The insert() method is as powerful as the append() method. The difference is the insert() method enables us to insert
 * the requested data at a particular position while the append() method allows us to add the requested data only at the
 * end of the StringBuilder object
 */
public class InsertStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2, 'r'); // inserts r at position 2
        System.out.println(sb1); // prints Born

        StringBuilder sb2 = new StringBuilder("123");
        char[] name = {'J', 'a', 'v', 'a'};
        sb2.insert(1, name, 1, 3); // insert at position 1 values ava from char array
        System.out.println(sb2); // prints 1ava23
    }
}
