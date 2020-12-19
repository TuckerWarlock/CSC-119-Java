/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
9/19/2020
 */

import java.util.Scanner;

public class ChangeDollarGame {
    //CONSTANTS
    //Coin worth in cents
    static final double PENNY = 0.01;
    static final double NICKEL = 0.05;
    static final double DIME = 0.10;
    static final double QUARTER = 0.25;
    static final double DOLLAR = 1.00;

    // Create a Scanner object for keyboard input.
    static final Scanner INPUT = new Scanner(System.in);


    public static void main(String[] args) {
        //variables
        int pennies;
        int nickels;
        int dimes;
        int quarters;
        double totalCoins;
        double result;

        //State purpose of program
        System.out.println("Welcome to The Dollar Game!\nEnter the number of Pennies, Nickels, Dimes and " +
                "Quarters\nthat will make EXACTLY one dollar.");

        // INPUT
        // get the number of each coin from the user
        pennies = getPennies();
        nickels = getNickels();
        dimes = getDimes();
        quarters = getQuarters();

        // PROCESS
        // calculate and display total coins entered by user
        totalCoins = totalCoins(pennies, nickels, dimes, quarters);

        //OUTPUT
        //determine and output if user input == dollar
        result = result(totalCoins);

        //close scanner object
        INPUT.close();
    }//end Main Method

    //INPUT METHODS
    //Get number of each coin from user
    public static int getPennies(){
        System.out.println("Enter the number of Pennies: ");
        int pennies = INPUT.nextInt();
        return pennies;
    }//end getPennies

    public static int getNickels(){
        System.out.println("Enter the number of Nickels: ");
        int nickels = INPUT.nextInt();
        return nickels;
    }//end getNickels

    public static int getDimes(){
        System.out.println("Enter the number of Dimes: ");
        int dimes = INPUT.nextInt();
        return dimes;
    }//end getDimes

    public static int getQuarters(){
        System.out.println("Enter the number of Quarters: ");
        int quarters = INPUT.nextInt();
        return quarters;
    }//end getQuarters

    //PROCESS
    //convert coin amount entered by user into cents
    //calculate user input - total of all coins
    public static double totalCoins(int pennies, int nickels, int dimes, int quarters){
        double myPennies = pennies * PENNY;
        double myNickels = nickels * NICKEL;
        double myDimes = dimes * DIME;
        double myQuarters = quarters * QUARTER;
        return myPennies + myNickels + myDimes + myQuarters;
    }//end totalCoins

    //OUTPUT
    //determine if result is == to dollar, 1.00
    public static double result(double myResult){
        if(myResult < DOLLAR){
            System.out.print("\nSorry you only entered $");
            System.out.printf("%.2f", myResult);
            System.out.print(" worth of coins.");
        }else if(myResult == DOLLAR){
            System.out.print("\nCONGRATULATIONS! You entered exactly $");
            System.out.printf("%.2f", myResult);
            System.out.print(" worth of coins.");
        }else if(myResult > DOLLAR){
            System.out.print("\nSorry you went OVER with $");
            System.out.printf("%.2f", myResult);
            System.out.print(" worth of coins.");
        }//end of if/else statements
        return myResult;
    }//end of result method

}//end ChangeDollarGame class
