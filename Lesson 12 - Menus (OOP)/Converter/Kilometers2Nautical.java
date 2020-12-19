/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

//class for converting kilometers to nautical miles
public class Kilometers2Nautical extends Converter{
    // start class

    private final String FROM_UNITS = "kilometers";
    private final String TARGET_UNITS = "nautical miles";

    private double conversionFactor = 0.539956803; // this conversion factor

    public Kilometers2Nautical()
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
}// end class
