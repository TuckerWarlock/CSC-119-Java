/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

//class for converting inches to centimeters
public class Inches2CM extends Converter 
{ // start class 
 
  private final String FROM_UNITS = "inches";  
  private final String TARGET_UNITS = "centimeters"; 
  
  private double conversionFactor = 2.54; // this conversion factor

  public Inches2CM() 
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