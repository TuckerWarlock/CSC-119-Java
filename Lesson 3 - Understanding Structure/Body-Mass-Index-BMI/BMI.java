import java.util.Scanner;  // for keyboard input

//this program uses return methods
public class BMI
{

   // CONSTANTS
   static final double CONST = 703; // BMI formula constant
   
   // Create a Scanner object for keyboard input.
   static final Scanner KEYBOARD = new Scanner(System.in);         
   
   public static void main(String[] args)
   {
        int weight = 0;  // the user supplied weight
        int height = 0;  // the user supplied height
        double theBMI = 0; // variable to capture the return value
   
        // INPUT
        // get the weight and height from the user
        weight = getWeight();
        height = getHeight();
   
        // PROCESS
        // calculate and display the BMI
        theBMI = calcBMI(weight, height);
        
        // OUTPUT
        System.out.println("Body Mass Index: " + theBMI);
   
   }  // end main()
   
   public static int getWeight()
   {    
        // get the weight from the user
        System.out.println("Enter a weight in lbs.");
        int myWeight = KEYBOARD.nextInt();
        
        return myWeight;  
   } // end getWeight()

   public static int getHeight()
   {    
        // get the height from the user
        System.out.println("Enter a height in inches.");
        int myHeight = KEYBOARD.nextInt();
        
        return myHeight;  
   } // end getHeight()

   public static double calcBMI(int myWeight, int myHeight)
   {   // calculate the BMI and return it in the reference parameter
       double myBMI = myWeight * CONST / (myHeight * myHeight);
       return myBMI;
   } // end calcBMI()

} // end class
