import java.util.Scanner;
//Main class
public class TipTaxTotal {

    //(CONSTANTS)
    //Set tax rate to 7%
    static final double TAX_RATE = 0.07; //equates to 7%
    //Create new scanner object to be used for input
    static final Scanner INPUT = new Scanner(System.in);

    //Main method to input total for food and a tip
    //Calculate the sales tax and total for the order
    public static void main(String[] args) {

        //Local Variables
        double foodTotal; //total food charge entered by user
        double tipPercent; //tip percentage entered by user
        double orderTip; //tip calculated on the order
        double orderTax; //tax calculated tax on the order
        double orderTotal; //food total + tip + tax

        //(INTRODUCTION)
        System.out.println("This program calculates tip, tax, and total for user input.");

        //(INPUT)
        //Prompt and store user input for food total
        System.out.print("Please enter the charge for the food: $");
        foodTotal = INPUT.nextDouble();
        //Prompt and store user input for tip percentage
        System.out.print("Enter tip percentage: %");
        tipPercent = INPUT.nextDouble();

        //(PROCESS)
        //Calculate tip amount
        orderTip = ((tipPercent * 0.01) * foodTotal);
        //Calculate tax on the order
        orderTax = (TAX_RATE * foodTotal);
        //Calculate the total of the order
        orderTotal = (orderTax + foodTotal + orderTip);

        //(OUTPUT)
        //Display tax for the order
        System.out.print("Tax: $");
        System.out.printf("%.2f", orderTax);
        //Display tip for the order
        System.out.print("\nTip: $");
        System.out.printf("%.2f", orderTip);
        //Display the total of the order
        System.out.print("\nTotal: $");
        System.out.printf("%.2f", orderTotal);

        //Close scanner object
        INPUT.close();//Close scanner

    }//end main ()
}//end TipTaxTotal class
