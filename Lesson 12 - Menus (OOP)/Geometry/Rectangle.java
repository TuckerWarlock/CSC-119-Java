/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

import java.util.Scanner;

public class Rectangle {

    // Create a Scanner object for keyboard input.
    static Scanner keyboard = new Scanner(System.in);

    public static void calculateRectangleArea() {
        double length;
        double width;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length
        System.out.print("Enter length? ");
        length = keyboard.nextDouble();

        // Get width
        System.out.print("Enter width? ");
        width = keyboard.nextDouble();

        // Display output
        System.out.println("The rectangle's area is "
                + Shape.areaOfRectangle(length, width));
        System.out.println();

    }//end calculate rectangle area method

}//end rectangle class
