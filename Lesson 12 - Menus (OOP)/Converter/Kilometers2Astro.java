/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */

//class for converting kilometers to astronomical units
public class Kilometers2Astro extends Converter{

    // start class

    private final String FROM_UNITS = "kilometers";
    private final String TARGET_UNITS = "astronomical units";

    private double conversionFactor = 6.684590000000001E9; // this conversion factor

    public Kilometers2Astro()
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
