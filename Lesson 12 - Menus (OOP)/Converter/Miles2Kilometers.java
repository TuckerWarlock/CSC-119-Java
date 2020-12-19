/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

//class for converting miles to kilometers
public class Miles2Kilometers extends Converter 
{ // start class 

  private final String FROM_UNITS = "miles";
  private final String TARGET_UNITS = "kilometers";
  
  private double conversionFactor = 1.609; // this conversion factor

  public Miles2Kilometers() 
  { // start CTOR 
      // call super class 
      super.convert(FROM_UNITS, getTargetUnits());
  } // end CTOR() 
  
  public double getConversionFactor()
  {
    return conversionFactor;
  }// end getConversionFactor()
  
  public String getTargetUnits()
  {
    return TARGET_UNITS; 
  } // end getTargetUnits()   
 
} // end class