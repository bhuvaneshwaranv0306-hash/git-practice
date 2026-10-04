/**
 * This program demonstrates basic Java concepts.
 * It includes variables, constants, methods and print statements.
 */
public class Main
{

    // Constant
    static final String COLLEGE = "ABC College";

    /**
     * Main method - program execution starts here.
     */
    public static void main(String[] args) 
    {

        // Variables
        String name = "Bhuvanesh";
        int age = 20;

        // Print statements
        System.out.println("Hello, Java!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + COLLEGE);

        // Calling custom method
        greet();
    }

    /**
     * Custom method to display a greeting.
     */
    public static void greet() 
    {
        System.out.println("Welcome to my first Java project!");
    }
}