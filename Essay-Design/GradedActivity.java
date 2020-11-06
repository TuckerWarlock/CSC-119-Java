//Graded activity class
public class GradedActivity {

    //variables
    double grammarScore;
    double spellingScore;
    double lengthScore;
    double contentScore;
    double totalScore;

    //get the score of the essay
    public double getScore() {
        //calculate the total score
        return totalScore =
                grammarScore + spellingScore +
                        lengthScore + contentScore;
    }

    //set the score of the essay
    //call the getGrade method and print to console
    public void setScore(){
        String finalScore = getGrade(totalScore);
        System.out.print("\nThe grade for this essay is ");
        System.out.print(finalScore);
    }

    //assign letter grade to score
    public String getGrade(double score){
            if(score>=90)
                return "A";
            else if(score>=80)
                return "B";
            else if(score>=70)
                return "C";
            else if(score>=60)
                return "D";
            else
                return "F";
    }
}//end GradedActivity class
