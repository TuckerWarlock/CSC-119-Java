/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

//class for converting feet to meters
public class Feet2Meters extends Converter 
{ // start class 
 
  private final String FROM_UNITS = "feet";  
  private final String TARGET_UNITS = "meters"; 
  
  private double conversionFactor = 0.3048; // this conversion factor

  public Feet2Meters() 
  { // start CTOR 
      // call super class 
      super.convert(FROM_UNITS, getTargetUnits());       
  } // end CTOR() 
  
  public double getConversionFactor()
  {
    return conversionFactor;
  } // end getConversionFactor()
  
  public String getTargetUnits()
  {
    return TARGET_UNITS; 
  } // end getTargetUnits() 
   
} // end class