import java.util.Scanner;

public class BMI {

    //CONSTANTS
    //BMI formula constants
    static final double CONST = 703;
    static final double UNDERWEIGHT = 18.5;
    static final double NORMAL_LOW = 18.6;
    static final double NORMAL_HIGH = 24.9;
    static final double OVERWEIGHT_LOW = 25;
    static final double OVERWEIGHT_HIGH = 29.9;
    static final double OBESE = 30;

    // Create a Scanner object for keyboard input.
    static final Scanner INPUT = new Scanner(System.in);

    //Display the BMI calculation to the user
    public static void main(String[] args) {
        //variables
        int weight;
        int height;
        double BMI;
        double RANGE;

        //State purpose of program
        System.out.println("Welcome to the BMI Calculator!");

        // INPUT
        // get the weight and height from the user
        weight = getWeight();
        height = getHeight();

        // PROCESS
        // calculate and display the BMI
        BMI = calculateBMI(weight, height);

        //OUTPUT
        //calculate and display the BMI ranges
        RANGE = bmiRange(BMI);

        //close scanner object
        INPUT.close();
    }//end main()

    //INPUT METHODS
    //Method to get the height and weight from the user
    public static int getWeight(){
        System.out.println("Enter your weight in pounds: ");
        int myWeight = INPUT.nextInt();
        return myWeight;
    }//end getWeight()

    //Method to get the height and weight from the user
    public static int getHeight() {
        System.out.println("Enter your height in inches: ");
        int myHeight = INPUT.nextInt();
        return myHeight;
    }//end getHeight()

    //PROCESS METHODS
    //Pass height and weight into module to calculate BMI
    public static double calculateBMI(int myWeight, int myHeight){
        //formula for calculating BMI
        double myBMI = myWeight * CONST / (myHeight * myHeight);
        System.out.println("Body Mass Index: " + myBMI);
        return myBMI;
    }//end calculateBMI()

    //OUTPUT
    //calculate ranges for BMI
    public static double bmiRange(double myBMI){
        if(myBMI <= UNDERWEIGHT){
            System.out.println("BMI determined to be 'Underweight'");
        }else if(myBMI >= NORMAL_LOW && myBMI < NORMAL_HIGH){
            System.out.println("BMI determined to be 'Normal'");
        }else if(myBMI > OVERWEIGHT_LOW && myBMI < OVERWEIGHT_HIGH){
            System.out.println("BMI determined to be 'Overweight'");
        }else if(myBMI > OBESE){
            System.out.println("BMI determined to be 'Obese'");
        }//end if else statements
        return myBMI;
    }//end bmiRange()

}//end BMI class
