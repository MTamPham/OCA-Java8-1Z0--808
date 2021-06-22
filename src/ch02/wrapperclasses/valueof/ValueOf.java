package ch02.wrapperclasses.valueof;

/*
 * Wrapper classes Byte, Short Integer, and Long cache objects with values in the range of -128 to 127.
 * Wrapper class Character caches objects with values 0 to 127.
 * Wrapper classes Float and Double don't cache objects for any ranges of values.
 *
 * The valueOf() method returns an object of the corresponding wrapper class when it's passed an argument of a primitive
 * type or String
 */
public class ValueOf {
    public static void main(String[] args) {
        Long var1 = Long.valueOf(123);
        Long var2 = Long.valueOf("123");
        System.out.println(var1 == var2); // prints true because this value is cached

        Long var3 = Long.valueOf(223);
        Long var4 = Long.valueOf("223");
        System.out.println(var3 == var4); // prints false because Integer instances created for int value 223 aren't stored in the Integer cache.
    }
}
