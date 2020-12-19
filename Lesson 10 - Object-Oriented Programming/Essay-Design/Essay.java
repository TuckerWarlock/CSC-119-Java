import java.util.Scanner;

//essay class uses objects from Graded activity
public class Essay extends GradedActivity{

    //CONSTANTS
    public static final Scanner INPUT = new Scanner(System.in);
    //instance of GradedActivity class
    GradedActivity myGradedActivity = new GradedActivity();

    //get grammar score from user
    public void getGrammar(){
        while(true)
        {
            System.out.println("Grammar (must be 30 or less): ");
            myGradedActivity.grammarScore = INPUT.nextFloat();
            if(myGradedActivity.grammarScore<=30)
                break;
        }
    }

    //set grammar score to grammar variable
    public double setGrammar(){
        return myGradedActivity.grammarScore;
    }

    //get spelling score from user
    public void getSpelling(){
        while(true)
        {
            System.out.println("Spelling (must be 20 or less):");
            myGradedActivity.spellingScore = INPUT.nextFloat();
            if(myGradedActivity.spellingScore<=20)
                break;
        }
    }

    //set spelling score to spelling variable
    public double setSpelling(){
        return myGradedActivity.spellingScore;
    }

    //get length from user
    public void getLength(){
        while(true)
        {
            System.out.println("Correct Length (must be 20 or less):");
            myGradedActivity.lengthScore = INPUT.nextFloat();
            if(myGradedActivity.lengthScore<=20)
                break;
        }
    }

    //set length score to length variable
    public double setLength(){
        return myGradedActivity.lengthScore;
    }

    //get content score from user
    public void getContent(){
        while(true)
        {
            System.out.println("Content (must be 30 or less):");
            myGradedActivity.contentScore = INPUT.nextFloat();
            if(myGradedActivity.contentScore<=30)
                break;
        }
    }

    //set content score to content variable
    public double setContent(){
        return myGradedActivity.contentScore;
    }

    //set the essay score
    public void setScore(){
        //get set score method from Graded activity
        myGradedActivity.setScore();
    }

    //show user all of the scores, the total, and the letter grade
    public void displayPoints(){
        //display the output
        System.out.println("\nThe recorded scores are:");
        System.out.printf("Grammer: %.1f\n",myGradedActivity.grammarScore);
        System.out.printf("Spelling: %.1f\n", myGradedActivity.spellingScore);
        System.out.printf("Correct Length: %.1f\n", myGradedActivity.lengthScore);
        System.out.printf("Content: %.1f\n", myGradedActivity.contentScore);
        System.out.printf("Total score: %.1f\n", myGradedActivity.getScore());


    }

}//end Essay class
