package ch03.passingtomethods.objectreferences;

public class Person {
    private String name;

    Person(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String val) {
        this.name = val;
    }
}

class Test {
    /*
     * When a method is passed a reference value, a copy of the reference (that is, the memory address) is passed to the
     * invoked method. The callee can do whatever it wants with its copy without ever changing the original reference
     * held by the caller.
     */
    public static void swap(Person p1, Person p2) {
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }

    /*
     * When a method modifies the state of the object reference passed to them, the new state will be applied because the
     * method argument and the original reference refers to the same object.
     */
    public static void resetValueOfMemberVariable(Person p1) {
        p1.setName("Rodrigue");
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Paul");
        System.out.println(person1.getName() + ":" + person2.getName());
        swap(person1, person2);
        System.out.println(person1.getName() + ":" + person2.getName());

        Person person3 = new Person("John");
        System.out.println(person3.getName());
        resetValueOfMemberVariable(person3);
        System.out.println(person3.getName());
    }
}