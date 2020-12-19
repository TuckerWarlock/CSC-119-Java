import java.util.Scanner;

public class CelsiusToFahrenheitTable {
    // CONSTANTS
    static final double CONST = 9.0/5.0;     // 9/5 constant,
    //   m - the slope of the line
    static final int FAHRENHEIT_FREEZE = 32;


    public static void main(String[] args) {
        //method call to perform loop and display table
        CelsiusTable();

    }// end main()

    public static void CelsiusTable(){
        //variables
        double celsiusTemp = 0;  // the input temp in Celsius
        double fahrenheitTemp = 0;  // the calculated temp in Celsius

        //INPUT
        //NONE - this program is for display purposes only

        //Column heading with temperature labels
        System.out.println("Celsius\tFahrenheit");

        // PROCESS and OUTPUT
        //loop to iterate through Celsius temperatures from 0 to 20
        //show the Fahrenheit temperature for each
        for(celsiusTemp = 0.0; celsiusTemp <= 20; celsiusTemp++){
            fahrenheitTemp = CONST * celsiusTemp + FAHRENHEIT_FREEZE;
            System.out.println(celsiusTemp + " \t" + fahrenheitTemp);
        }//end for loop
    }

}// end CelsiusToFahrenheitTable class
