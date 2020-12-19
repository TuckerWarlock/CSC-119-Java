import java.util.Scanner;

public class FatGramCalculator {
    //CONST
    static final double LOW_FAT = 30;
    static final double GRAM = 9;
    static final double PERCENT = 100;
    // Create a Scanner object for keyboard input.
    static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        //Welcome message
        System.out.println("This program calculates the % of calories from fat in a food,\n" +
                "    and signals when a food is low fat.\n" +
                "When asked,...\n" +
                "    enter the number of fat grams and calories in the food.");

        //method call for INPUT, PROCESS, and OUTPUT
        fatGrams();

        //exit message
        System.out.println("Good Bye");

    }//end main()

    public static void fatGrams(){
        String exit = "";
        //PROCESS
        //loops to perform calculations and get user input
        while(!exit.equalsIgnoreCase("Q")) {
            //variables - declared here to be reset if user wants to go again
            double percentage;
            double grams = -1;
            double calories = -1;

            //INPUT
            //prompt user to enter number of fat grams
            //repeat until they enter a valid number
            while(grams < 0) {
                System.out.println("Enter the number of fat grams (not less than 0.0 grams)");
                grams = INPUT.nextInt();
                grams = grams * GRAM;
            }//end while loop

            //prompt user to enter number of calories
            //repeat until they enter a valid number
            while(calories < grams){
                System.out.println("Enter the number of calories (MUST exceed "
                        + (grams) + " (fat grams X 9.0))");
                calories = INPUT.nextInt();
            }//end while loop

            //PROCESS
            //percentage of fat in the food
            percentage = ((grams) / calories) * PERCENT;

            //OUTPUT
            //show results to user

            //check if percentage is less than 30%, display result
            if(percentage < LOW_FAT){
                System.out.println("This food is considered low fat because the " +
                        "percentage of fat: " + percentage + "%, is below 30.0%");
            }else {
                System.out.println("The percentage of fat in this food is " + percentage + "%");
            }//end if-else

            //check sentinel value, exit loop if met
            System.out.println("Press 'c' to continue OR 'q' to QUIT");
            exit = INPUT.next();
        }//end while loop

    }//end fatGrams() method

}// FatGramCalculator
