import java.io.*;
import java.util.Scanner;

public class GolfClubWrite {
    //constants
    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //variables
        String playerName;
        String playerScore;
        char exit = 'y';

        //create new golf.txt file if one does not exist
        try{
            File myFile = new File("golf.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        }//end TRY
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }//end CATCH

        //get user input and write to file
        while(exit == 'y'){

            //get user input
            System.out.println("Enter a player's name: ");
            playerName = INPUT.nextLine();
            System.out.println("Enter the player's score: ");
            playerScore = INPUT.nextLine();

            //write to the golf.txt file
            try {
                //create new FileWriter object, set to append mode
                BufferedWriter writer = new BufferedWriter
                        (new FileWriter("golf.txt", true));
                //write to file
                writer.write(playerName);
                writer.write(",");
                writer.write(playerScore);
                writer.write(System.getProperty( "line.separator" ));
                writer.flush();
                //close writer object
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }//end catch

            //ask user to input another record
            System.out.println("Would you like to enter another record?");
            System.out.println("Enter y for yes, or anything else for no:");
            //check if user input value equals exit statement
            exit = INPUT.nextLine().charAt(0);
        } //end while loop

        //exit program
        System.exit(0);

    }//end MAIN method

}//end GolfClubWrite class
