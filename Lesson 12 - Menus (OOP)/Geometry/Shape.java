/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */



public class Shape {

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }//end area of circle method

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }//end area of rectangle method

    public static double areaOfTriangle(double base, double h) {
        return base * h * 0.5;
    }//end area of triangle method

}//end shape class
