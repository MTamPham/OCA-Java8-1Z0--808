package ch04.array;

/*
 * An array is an object that stores a collection of values. Arrays can store two types of data:
 * - A collection of primitive data types
 * - A collection of objects
 *
 * An array of primitives stores a collection of values that constitute the primitive values themselves.
 * An array of objects store a collection of values, which are the heap-memory addresses or pointers to the object
 * instances the array is said to store.
 *
 * The members of an array are defined in contiguous (continuous) memory locations and hence offer improved access speed.
 *
 * Creating an array involves three steps:
 * - Declaring the array
 * - Allocating the array
 * - Initializing the array elements
 * These steps can be separate lines of code or combine them on the same line of code.
 *
 * When we combine an array declaration, allocation, and initialization in a single step, we can't specify the size of the
 * array. The size of the array is calculated by the number of values that are assigned to the array.
 *
 * Multi-dimensional array can be asymmetrical. It can define a different number of columns for each of its rows.
 */
public class CreateArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{4, 8, 107}; // array of primitive data
        String[] objArr = new String[]{"Harray", "Paul", "Sarah", "Christine"}; // array of objects

        int[] intArray2 = {0, 1};
        String[] strArray = {"Summer", "Winter"};
        int[][] multiArray = {{0, 1}, {3, 4, 5}}; // asymmetric two-dimensional array
    }
}
