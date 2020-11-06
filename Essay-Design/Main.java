//Test Driver class
public class Main extends Essay {

    public static void main(String[] args)
    {
        //get user input
        System.out.println("Enter the grades for an Essay: ");
        //create instance of the Essay class
        Essay myEssay = new Essay();

        //call getter methods
        myEssay.getGrammar();
        myEssay.getSpelling();
        myEssay.getLength();
        myEssay.getContent();

        //show the total points
        myEssay.displayPoints();

        //display the letter grade
        myEssay.setScore();
        
    }//end Main() method
}//end Main class