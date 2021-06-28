package ch03.objectlifecycle;

/*
 * Once an object is created, it can be accessed using its reference variable. It remains accessible until it goes out
 * of scope or no longer referenced by a variable.
 * If we re-assign another object to an initialized reference variable, the previous object becomes inaccessible
 * from that variable.
 *
 * When an object goes out of scope, it can no longer be referenced and is marked for garbage collection.
 * A variable that already refers to an instance can be assigned another instance or explicitly set to null. In this
 * case, the earlier instance is de-referenced and becomes eligible for garbage collection.
 *
 * The garbage collector is a low-priority thread that marks the objects eligible for garbage collection in the JVM and
 * then clears the memory of these objects.
 * We can determine only which objects are eligible to be garbage collected but we can never determine when a particular
 * object will be garbage collected.
 * As a programmer, we can't start execution of Java's garbage collector. We can only request it to be started by calling
 * System.gc() or Runtime.getRuntime().gc(). But calling this method doesn't guarantee when the garbage collector would
 * start.
 * The garbage collector can also reclaim memory from a group of referenced objects. This group of variables is referred
 * to as an island of isolation.
 */
public class Exam {
    String name;
    private Exam other;

    public Exam() {

    }

    public Exam(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setExam(Exam exam) {
        other = exam;
    }
}

class ObjectLife1 {
    public static void main(String[] args) {
        Exam myExam = new Exam(); // create a reference variable and initializes it with an object of class Exam
        myExam.setName("OCA Java Programmer 1"); // call method on the object referenced by the variable
        myExam = null; // assigns a value null to the reference variable, the object referenced by this variable is no
                       // longer accessible through this variable. It's considered garbage by Java and deemed eligible
                       // to be sent to the garbage bin by Java's garbage collector
        myExam = new Exam(); // create a new object of class Exam and assigns it to the reference variable
        myExam.setName("PHP"); // call method on the second object
    }
}

class ObjectLife2 {
    public static void main(String[] args) {
        Exam myExam = new Exam("PHP"); // an Exam instance is created and assigned to the variable
        myExam = null; // the referenced variable is set to null
        myExam = new Exam("SQL"); // create another Exam instance and re-assigns that instance to the referenced
                                        // variable, the first instance is de-referenced
        myExam = new Exam("Java"); // create another Exam instance and re-assigns that instance to the referenced
                                        // variable, the second instance is de-referenced
        Exam yourExam = new Exam("PMP"); // another referenced variable is initialized
        yourExam = myExam; // assigns myExam variable to the yourExam variable
    }
}

class IslandOfIsolation {
    public static void main(String[] args) {
        Exam php = new Exam("PHP"); // initialize variable php
        Exam java = new Exam("Java"); // initialize variable java

        php.setExam(java); // assign object referred by java to php
        java.setExam(php); // assign object referred by php to java

        php = null; // assign null to php
        java = null; // assign null to java

        // After this step, even although both these objects can be referred to by each other, they can no longer be
        // referenced in the method main. They form an island of isolation. Java's garbage collector can determine such
        // groups of instances.
    }
}