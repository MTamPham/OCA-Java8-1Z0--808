package ch04.array;

/*
 * Array allocation will allocate memory for the elements of an array. When allocating memory for an array, we should
 * specify its dimensions, such as the number of elements they array should store.
 * It's allocated using the keyword "new", followed by the type of value that its stores, and then its size.
 * The code won't compile if we don't specify the size of the array or if we place the array size on the left of the = sign.
 * The size of the array must evaluate to an int value. Java accepts an expression to specify the size of an array, as long
 * as it evaluates to an int value.
 *
 * Once allocated, all of the array elements store their default values. For arrays that store objects, all the allocated
 * array elements store null. For arrays that store primitive values, the default values depend on the exact data types
 * stored by them.
 *
 * Note that the size of an array can't expand or reduce once it is allocated.
 */
public class ArrayAllocation {
    public static void main(String[] args) {
        // array declaration
        int[] intArray;
        String[] strArray;
        int[][] multiArr;
        // array allocation
        intArray = new int[2];
        strArray = new String[4];
        multiArr = new int[2][3];
        multiArr = new int[2][]; // OK to define the size in only the first square bracket

        strArray = new String[2 * 5];
        int x = 10, y = 4;
        strArray = new String[x * y];
        strArray = new String[Math.max(2, 3)];

        // this code won't compile
//        intArray = new int[]; // array size missing
//        intArray[2] = new int; // array size placed incorrectly
//        intArray = new int[2.4]; // can't define size of an array as a floating-point number
//        multiArr = new int[]; // non-matching square brackets
//        multiArr = new int[][3] // size in the first square bracket missing
    }
}
