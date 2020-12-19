/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

import java.util.Scanner;

//converter class to get the user input and call the calculation methods
public class Converter 
{ // start class 

  // Create a Scanner object for keyboard input. 
  static Scanner keyboard = new Scanner(System.in);   

  public void convert(String fromUnits, String targetUnits) 
  {   
      // Prompt the user for the number of units to convert 
      System.out.print("Enter the number of " + fromUnits + " to convert: ");     
      double unitValue = keyboard.nextDouble();   
      
      displayResult(unitValue);      
  } // end convert() 

  public void displayResult(double value2Convert)
  {
    double result = value2Convert * this.getConversionFactor();
    System.out.println("That is equal to " + result + " " +
                       this.getTargetUnits() + ".");  
    System.out.println();  // print a blank line                          
  } // end displayResult()

  // OVERLOAD THESE FUNCTIONS IN THE DERIVED CLASS
  public double getConversionFactor()
  {
    return 0; 
  } // end getConversionFactor()
  
  public String getTargetUnits()
  {
    String theTargetUnits = "";
    return theTargetUnits; 
  } // end getTargetUnits() 
  
} // end class