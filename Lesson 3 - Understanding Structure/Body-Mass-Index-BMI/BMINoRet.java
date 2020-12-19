import java.util.Scanner;  // for keyboard input

//this program uses void methods
public class BMINoRet
{

   // CONSTANTS
   static final double CONST = 703; // BMI formula constant
   
   // Create a Scanner object for keyboard input.
   static final Scanner KEYBOARD = new Scanner(System.in);    
   
   // module return variables - there is a better way, stay tuned
   static int weight = 0;  // the user supplied weight
   static int height = 0;  // the user supplied height
   static double theBMI = 0; // variable to capture the return value              
   
   public static void main(String[] args)
   {
        // INPUT
        // get the weight and height from the user
        getWeight();
        getHeight();
   
        // PROCESS
        // calculate and display the BMI
        calcBMI(weight, height);
        
        // OUTPUT
        System.out.println("Body Mass Index: " + theBMI);
   
   }  // end main()
   
   public static void getWeight()
   {    
        // get the weight from the user
        System.out.println("Enter a weight in lbs.");
        weight = KEYBOARD.nextInt(); 
   } // end getWeight()

   public static void getHeight()
   {    
        // get the height from the user
        System.out.println("Enter a height in inches.");
        height = KEYBOARD.nextInt(); 
   } // end getHeight()

   public static void calcBMI(int myWeight, int myHeight)
   {   // calculate the BMI and return it in the reference parameter
       theBMI = myWeight * CONST / (myHeight * myHeight);
   } // end calcBMI()

} // end class
