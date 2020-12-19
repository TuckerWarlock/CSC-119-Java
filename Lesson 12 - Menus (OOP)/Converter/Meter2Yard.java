/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

//class for converting meters to yards
public class Meter2Yard extends Converter{
    // start class

    private final String FROM_UNITS = "meters";
    private final String TARGET_UNITS = "yard";

    private double conversionFactor = 1.09361; // this conversion factor

    public Meter2Yard()
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
