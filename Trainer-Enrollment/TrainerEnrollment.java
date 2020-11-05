//TrainerEnrollment class
public class TrainerEnrollment
{
    /*
    Trainers at Tom's Athletic Club are encouraged to enroll new members.
    Write an application that extracts the names of Trainers and groups them
    based on the number of new members each trainer has enrolled this year.
     */
    public static void main(String[] args)
    {
        //This is not recommended, as the Main() method was "gutted."
        //This does work but does not represent correct OOP practices

        //calling to myArrays method
        myArrays();
        System.out.println("\nEnd of job");
    }

    //method to print trainers and number of enrolled trainers
    public static void myArrays()
    {
        //array to store trainer names
        String[] myTrainers = {"Jake Butt", "Ziggy Hood", "Hroniss Grasu", "Vontaze Burfict", "Jaquiski Tartt",
                "Ndamukong Suh", "Thurston Armbrister", "Captain Munnerlyn", "Barkevious Mingo", "Ha Ha Clinton-Dix",
                "Mister Alexander", "BenJarvus Green-Ellis", "Richie Incognito", "Champ Bailey", "Captain Munnerlyn",
                "Mike Kafka", "Ras-I Dowling", "Bryan Anger", "D'Brickashaw Ferguson", "Rex Hadnot",
                "Sage Rosenfels", "Robert Griffin III", "Sav Rocca", "Chad Ochocinco", "Brett Rypien"
        };


        //array to store enrollment numbers for Trainers
        int[] myEnrollments = {3, 9, 13, 26, 23,
                19, 15, 13, 17, 8,
                2, 3, 5, 7, 11,
                18, 12, 14, 20, 16,
                4, 6, 10, 1, 0
        };

        int count = 1;
        int prev = 0;
        int totalCount = 0;
        System.out.println("\nThis program grades the trainer's enrollment.");
        System.out.println("\nThose who enrolled from,...");

        for(int i = 0; i < myEnrollments.length; i++) {
            if(count==6) {
                System.out.print("\n" + prev + " to " + totalCount + " - ");
                int j;
                int c = 0;
                for(j = 0; j < myEnrollments.length; j++) {
                    if(myEnrollments[j] >= prev &&
                            myEnrollments[j] <= totalCount) {
                        c++;
                    }//end IF
                }//end FOR loop

                System.out.println(c + " trainers");

                for(j = 0; j < myEnrollments.length; j++) {
                    if(myEnrollments[j] >= prev &&
                            myEnrollments[j] <= totalCount) {
                        System.out.print(myTrainers[j] + "("
                                + myEnrollments[j] + ")");
                        if((j + 1) < myEnrollments.length)
                            System.out.print(", ");
                    }//end IF statements
                }//end FOR loop
                count = 0;
                prev = ++totalCount;
            }
            count++;
            totalCount++;
        }//end FOR loop
    }//end myArrays() method

}//end TrainerEnrollment class