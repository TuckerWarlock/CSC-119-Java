import java.util.Scanner;

//Program to convert user input (Celsius) to Fahrenheit
public class CtoF_Converter {
    //(CONSTANTS)
    static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        // CONSTANTS
        static final double CONST = 9.0/5.0;     // 9/5 constant,
        //   m - the slope of the line
        static final int FAHRENHEIT_FREEZE = 32; // water freezing temp in Fehrenheit,
        //   b - the y intercept

        // Create a Scanner object for keyboard input.
        static final Scanner KEYBOARD = new Scanner(System.in);

        public static void main(String[] args)
        {
            double celsiusTemp = 0;  // the input temp in Celsius
            double fahrenheitTemp = 0;  // the calculated temp in Celsius

            // INPUT
            System.out.println("Please enter a temperature in Celsius.");  // user prompt
            celsiusTemp = KEYBOARD.nextInt();                              // user input
            // PROCESS
            // NOTE that the conversion formula is simply the standard equation of a line y = mx + b
            fahrenheitTemp = CONST * celsiusTemp + FAHRENHEIT_FREEZE;      // calculation
            // OUTPUT
            // post the result
            System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheitTemp);

    }//end main()
}//end CtoF_Converter class
