/*
 * Structure of a Java class
 * Package statement
 * Import statements
 * Comments
 * Class declaration {
 *     Variables
 *     Comments
 *     Constructors
 *     Methods
 *     Nested classes
 *     Nested interfaces
 *     Enum
 * }
 */

/*
 * The "package" statement must be placed on top of others. There is an exception where comments can be placed on top of it.
 * All classes are part of a package. A Java class can be explicitly defined in a named package; otherwise, it becomes a
 * part of a "default" package.
 * There can be only one "package" statement in a Java source code file. All classes and interfaces defined in the same
 * Java source code file can't be defined in separated packages.
 */
package ch01;

/*
 * Classes and interfaces in the same package can talk to each other without using the fully qualified names.
 * However, to talk to classes and interfaces from another package, the fully qualified names are required such as packageName.anySubPackageName.Classname
 * The "import" statement comes into save your time and make better code readiness so you can use the simple name of classes or interfaces.
 * For example:
 * import packageName.anySubPackageName;
 * Classname clazz = new Classname();
 *
 * NOTE: Members of a named package can't access classes and interfaces defined in the "default" package.
 */

/*
 * The syntax to declare a class
 * <access modifier> <non-accesss modifier> class <name of class> <extends> <base class name> <implements> <name of implemented interface> {}
 * where the "class" keyword, name of class and curly braces are compulsory.
 *
 * A class is a design used to specify the attributes and behavior of an object.
 * The attributes are implemented using variables, and the behavior is implemented using methods.
 * Constructors are used to create and initialize an instance of a class.
 *
 * A Java source code file can have either a single class or an interface or multiple such entities.
 * When defining a public class or interface in the source code file, the names of class or interface and Java source file must match.
 * Also, a source file can't define more than one "public" class or interface.
 *
 * A Java class having a main method is an executable class. Otherwise, it is just a non-executable class.
 *
 * An application can define more than one executable class but only one (and exactly one) can run at a time.
 */
public class Clazz {
}
