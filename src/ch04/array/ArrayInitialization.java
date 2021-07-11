package ch04.array;

/*
 * The Java compiler doesn't check the range of the index positions at which we try to access an array element. It will
 * throw a runtime exception, ArrayIndexOutOfBoundsException.
 * Code to access an array element will fail to compile if we don't pass it a char, byte, short or int data type.
 * For an array of objects, we can set a position to value null, but it doesn't remove the array position.
 */
public class ArrayInitialization {
    public static void main(String[] args) {
        // array declaration
        int[] intArray;
        // array allocation
        intArray = new int[2];
        // initialize array using a loop
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 5;
        }
        // re-initialize individual array elements
        intArray[0] = 10;
        intArray[1] = 1870;

        // array declaration
        int[][] multiArr;
        // array allocation
        multiArr = new int[2][3];
        for (int i = 0, n  = multiArr.length; i < n; i++) {
            for (int j = 0, m = multiArr[i].length; j < m; j++) {
                multiArr[i][j] = i + j;
            }
        }
        // re-initialize array without a loop
        multiArr[0][0] = 10;
        multiArr[1][2] = 1210;
        multiArr[0][1] = 110;
        multiArr[0][2] = 1087;

        int[] anotherArray = new int[2];
        // this code won't compile
//        System.out.println(anotherArray[1.2]);

        String[] strArray = new String[]{"Autumn", "Summer", "Spring", "Winter"};
        strArray[2] = null;
        for (String val : strArray) {
            System.out.println(val);
        }
    }
}
