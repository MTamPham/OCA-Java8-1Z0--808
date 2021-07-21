package ch05.enhancedforloop;

import java.util.ArrayList;

/*
 * The enhanced for loop is also called the for-each loop.
 *
 * When we're iterating through an array of primitive values, manipulation of the for loop variable will never change
 * the value of the array being iterated because the primitive value are passed by value to the loop variable in an
 * enhanced for loop.
 *
 * When we iterate through a collection of objects, the value of the collection is passed by reference to the loop variable.
 * If the value of the loop variable is manipulated by executing methods on it, the modified value will be reflected in
 * the collection of objects being iterated.
 *
 * A nested loop executes all its iterations for each single iteration of its immediate outer loop.
 *
 * Limitations of the enhanced for loop:
 * - It can't be used to initialize an array and modify its elements
 * - It can't be used to delete or remove the elements of a collection
 * - It can't be used to iterate over multiple collections or arrays in the same loop
 */
public class EnhancedFor {
    public static void main(String[] args) {
        ArrayList<String> exams = new ArrayList<>();
        exams.add("Java");
        exams.add("Oracle");

        ArrayList<String> levels = new ArrayList<>();
        levels.add("Basic");
        levels.add("Advanced");

        ArrayList<String> grades = new ArrayList<>();
        grades.add("Pass");
        grades.add("Fail");

        ArrayList<ArrayList<String>> nestedArrayList = new ArrayList<>();
        nestedArrayList.add(exams);
        nestedArrayList.add(levels);
        nestedArrayList.add(grades);

        // prints
        // Java
        // Oracle
        // Basic
        // Advanced
        // Pass
        // Fail
        for (ArrayList<String> nestedListElement : nestedArrayList) {
            for (String element : nestedListElement) {
                System.out.println(element);
            }
        }

        int total = 0;
        int[] primeNums = {2, 3, 7, 11};
        for (int num : primeNums) {
            total += num;
        }
        System.out.println(total); // prints 23

        StringBuilder[] myArr = {
                new StringBuilder("Java"),
                new StringBuilder("Loop")
        };
        for (StringBuilder val : myArr) {
            System.out.println(val); // prints Java and Loop
        }
        for (StringBuilder val : myArr) {
            val.append("Oracle"); // appends Oracle to value referenced by loop variable val
        }
        for (StringBuilder val : myArr) {
            System.out.println(val); // prints JavaOracle and LoopOracle
        }

        // nested enhanced for loop
        for (String exam : exams) {
            for (String level : levels) {
                for (String grade : grades) {
                    System.out.println(exam + ":" + level + ":" + grade);
                }
            }
        }
    }
}
