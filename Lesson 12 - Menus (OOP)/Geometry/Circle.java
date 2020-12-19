/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

import java.util.Scanner;

public class Circle extends Shape {
// start class

    // Create a Scanner object for keyboard input.
    static Scanner keyboard = new Scanner(System.in);

    public static void calculateCircleArea() {

        double radius;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");
        radius = keyboard.nextDouble();

        // Display output
        System.out.println("The circle's area is "
                + Shape.areaOfCircle(radius));
        System.out.println();
    }//end calculate circle area method

} // end circle class
