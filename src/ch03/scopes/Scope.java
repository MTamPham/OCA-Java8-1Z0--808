package ch03.scopes;

/*
 * The scope of a variable specifies its life span and its visibility.
 * Variables can have multiple scopes: class, instance, method and local.
 * - Local variables (also known as method-local variables) are defined within a method and are normally used to store
 * the intermediate results of a calculation
 * - Method variables (also known as method arguments) are used to pass values to a method. These values can be manipulated
 * and may also be assigned to instance variables.
 * - Instance variables (also known as attributes, fields and non-static variables) are used to store the state of an
 * object. These are the values that need to be accessed by multiple methods.
 * - Class variables (also known as static variables) are used to store values that should be shared by all the objects
 * of a class.
 *
 * Variables with the same name in different scopes need to obey the following rules:
 * - A static variable and an instance variable can't be defined with the same name
 * - Local variables and method parameters can't be defined with the same name
 *
 * A class can define local variables with the same name as the instance or class variables, also referred to as shadowing.
 */
public class Scope {
}
