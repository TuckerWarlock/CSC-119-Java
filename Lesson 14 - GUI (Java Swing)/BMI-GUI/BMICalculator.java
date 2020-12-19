/*
 * @author Tucker Parker-Warwick
 * CSC 119 Intro to Programming - JAVA
 * 12/13/2020
 */

import javax.swing.*;

public class BMICalculator {
    
    /*declared as class-level variables so they may be used 
    by any method within the class*/
    public double weight;
    public double height;
    private double BMI;
    
    //Method to get the height and weight from the user
    public void getWeightAndHeight(String weightText, String heightText){
        //parse double from user input in JTextField
        height = Double.parseDouble(heightText);
        weight = Double.parseDouble(weightText);
    }//end getWeightAndHeight()
    
    //Pass height and weight into module to calculate BMI
    public String calculateBMI(String calcLabel){
        //formula for calculating BMI
        BMI = (weight * 703) / (height * height);
        //cast double to int to remove decimal place
        int nHeight = (int) height;
        int nWeight = (int) weight;
        //return calculation to user in appropriate JLabel
        return calcLabel = ("The Body Mass Index for a height of " + nHeight +
                " and a weight of " + nWeight + " is: " + BMI);
    }//end calculateBMI()
    
    //calculate ranges for BMI and display
    public String bmiRange(String rangeLabel){
        if(BMI < 18.5){
            rangeLabel = ("BMI < 18.5 is considered 'Underweight'");
        }else if(BMI > 18.5 && BMI < 24.9){
            rangeLabel = ("BMI > 18.6 and < 25 is considered 'Normal'");
        }else if(BMI > 25 && BMI < 29.9){
            rangeLabel = ("BMI > 25 and < 30 is considered 'Overweight'");
        }else if(BMI > 30){
            rangeLabel = ("BMI > 30 is considered 'Obese'");
        }//end if else statements
        return rangeLabel;
    }//end bmiRange()
    
    
}//end Class BMI Calculator
