package ch03.scopes.clazz;

public class TestPhone {
    public static void main(String[] args) {
        Phone.softKeyboard = false;
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        System.out.println(p1.softKeyboard); // prints false
        System.out.println(p2.softKeyboard); // prints false
        p1.softKeyboard = true;
        System.out.println(p1.softKeyboard); // prints true
        System.out.println(p2.softKeyboard); // prints true
        System.out.println(Phone.softKeyboard); // prints true
    }
}
