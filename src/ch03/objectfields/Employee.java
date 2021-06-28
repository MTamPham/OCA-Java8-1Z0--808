package ch03.objectfields;

/*
 * An object field is another name for an instance variable defined in a class.
 * Using methods to read and write object fields
 * Using constructors to write values to object fields
 * Directly accessing instance variables to read and write object fields
 *
 * All the instance variables (object fields) are assigned their default values if we try to access or read their values
 * before writing any values to them.
 *
 * Java uses the dot notation (.) to execute a method on a reference variable.
 */
public class Employee {
    String name;
    int age;

    Employee() {
        this.age = 22;
    }

    public void setName(String val) {
        this.name = val;
    }

    public void printEmp() {
        System.out.println("name = " + this.name + " age = " + this.age);
    }

    public int daysOffWork(int... days) {
        int daysOff = 0;
        for (int i = 0; i < days.length; i++) {
            daysOff += days[i];
        }
        return daysOff;
    }
}

class Office {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.printEmp();
        e1.name = "Selvan";
        e2.setName("Harry");
        e1.printEmp();
        e2.printEmp();
        System.out.println(e1.daysOffWork(1, 2, 3, 4));
        System.out.println(e2.daysOffWork(1, 2, 3));
    }
}