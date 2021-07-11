package ch04.array;

/*
 * An array declaration includes the array type and array variable. The type of objects that an array can store depends
 * on its type. An array type is followed by one or more empty pairs of square brackets [].
 * To declare an array, specify its type, followed by the name of they array variable.
 * The number of bracket pairs indicates the depth of array nesting.
 * The array declaration only creates a variable that refers to null.
 *
 * An array type can be any of the following:
 * - Primitive data type
 * - Interface
 * - Abstract class
 * - Concrete class
 *
 * Note that because no elements of an array created when it's declared, it's invalid to define the size of an array
 * with its declaration
 */
public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] anArray; // single dimensional array
        String[] strArray;
        int[][] multiArray; // multi-dimensional array

        // this code won't compile
//        int[2] intArray;
//        String[5] strArray;
//        int[2] multiArray[3];
    }
}
