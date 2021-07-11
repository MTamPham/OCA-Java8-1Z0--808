package ch04.string;

public class CountString {
    // The following code creates a total of five String objects
    public static void main(String[] args) {
        String summer = new String("Summer"); // create a String object but the object isn't placed in the String pool
        String summer2 = "Summer"; // create a String object and store in the String pool
        System.out.println("Summer");
        System.out.println("autumn"); // create a String object and store in the String pool
        System.out.println("autumn" == "summer"); // "summer" is new to the String pool, it is created
        String autumn = new String("Summer"); // create another String object of "Summer" value
    }
}
