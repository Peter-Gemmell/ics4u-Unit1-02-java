/*
*  Program calculate e=mc^2
*
* @author  Peter Gemmell
* @version 1.0
* @since 2022-9-16
*/

// Imports.
import java.util.Scanner;

/**
* This program calculates energy from mass.
* (remember to change the name after "final class").
*/
final class Energy {

    /**
    * Speed of light squared.
    */
    public static final double SPEED_OF_LIGHT_SQUARED = Math.pow(299792458, 2);

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Variables
        final double energy;
        final float mass;
        // Create a scanner object
        final Scanner myObj = new Scanner(System.in);
        // Ask for inputs
        System.out.println("What is mass :  ");

        /*
        * This accepts an inputted and tests it.
        */
        try {
            // Stores float in variable.
            mass = myObj.nextFloat();

            // Calculations
            energy = mass * SPEED_OF_LIGHT_SQUARED;
            System.out.println(energy + "Joules would be produced");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Not an acceptable input");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
