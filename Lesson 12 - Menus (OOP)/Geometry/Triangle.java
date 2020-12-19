/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

import java.util.Scanner;

public class Triangle {

    public static void calculateTriangleArea() {

        double base;
        double height;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base
        System.out.print("Enter length of the triangle's base? ");
        base = keyboard.nextDouble();

        // Get the height
        System.out.print("Enter triangle's height? ");
        height = keyboard.nextDouble();

        // Display the triangle's area.
        System.out.println("The triangle's area is "
                + Shape.areaOfTriangle(base, height));
        System.out.println();

    }//end calculate triangle method

}//end triangle class
