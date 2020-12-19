import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class GolfClubRead {

    public static void main(String[] args) throws IOException {
        //variables
        String playerName;
        String playerScore;
        int playerScoreNum;

        //create new buffered reader object
        try (BufferedReader reader = new BufferedReader(new FileReader
                ("golf.txt"))) {
            //string to store records
            String record;
            //step through the file until there are no more entries
            while ((record = reader.readLine()) != null) {

                //create new array to store the record values
                //separate record by comma
                String[] value = record.split(",");
                //assign values from array to variables
                playerName = value[0];
                playerScore = value[1];
                //print player name and score to "table"
                System.out.print("Player Name: ");
                System.out.print(playerName);
                System.out.print(" Score: ");
                System.out.print(playerScore);
                System.out.println();
            }//end WHILE loop
        }

        //create another Buffered Reader object
        ArrayList<String> arrayListName;
        ArrayList<Integer> arrayListScore;
        try (BufferedReader newReader = new BufferedReader(new FileReader
                ("golf.txt"))) {
            //string to store records
            String newLine;
            //create new array list for player records
            arrayListName = new ArrayList<>();
            arrayListScore = new ArrayList<>();

            //step through the file until there are no more entries
            while ((newLine = newReader.readLine()) != null) {
                //create new array, assign player name and score
                String[] newValue = newLine.split(",");
                playerName = newValue[0];
                playerScore = newValue[1];
                //parse player score as int from string value
                playerScoreNum = Integer.parseInt(playerScore);
                //add values from player name and score to appropriate arrayLists
                arrayListName.add(playerName);
                arrayListScore.add(playerScoreNum);
            }
        }
        //find the index of the lowest score (Golf is the lowest score)
        int lowScoreIndex = arrayListScore.indexOf(Collections.min(arrayListScore));
        //print the player name associated with the lowest score
        System.out.println("The player with the best score is : " + arrayListName.get(lowScoreIndex));
    }//end MAIN method

}//end GolfClubRead class
