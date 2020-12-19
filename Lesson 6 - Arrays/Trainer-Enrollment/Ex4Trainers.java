//This was converted from C++ to java
//The entire program is convoluted even though it is correct
import java.util.Scanner;

public class Ex4Trainers  
{
   // CONSTANTS
   static final int SIZE = 25;
   // these are the trainers
   static final String TRAINERS[] = {"Jake Butt", "Ziggy Hood", "Hroniss Grasu", "Vontaze Burfict", "Jaquiski Tartt",
                                  "Ndamukong Suh", "Thurston Armbrister", "Captain Munnerlyn", "Barkevious Mingo", "Ha Ha Clinton-Dix",
                                  "Mister Alexander", "BenJarvus Green-Ellis", "Richie Incognito", "Champ Bailey", "Captain Munnerlyn",
                                  "Mike Kafka", "Ras-I Dowling", "Bryan Anger", "D'Brickashaw Ferguson", "Rex Hadnot",
                                  "Sage Rosenfels", "Robert Griffin III", "Sav Rocca", "Chad Ochocinco", "Brett Rypien"
                                 };
   // parallel array of each trainers enrollment this year
   static final int ANNUAL_ENROLLMENT[] = {3, 9, 13, 26, 23,
                                        19, 15, 13, 17, 8,
                                        2, 3, 5, 7, 11,
                                        18, 12, 14, 20, 16,
                                        4, 6, 10, 1, 0
                                       };
   // enrollment thresholds
   static final int LOW_MIN = 0;
   static final int LOW_MAX = 5;
   static final int MID_MIN = 6;
   static final int MID_MAX = 12;
   static final int HIGH_MIN = 13;
   static final int HIGH_MAX = 20;
   
      // indexes for sub-parallel arrays 
   static final int IDX_NUM_LOW_ENROLLERS = 0;
   static final int IDX_NUM_MID_ENROLLERS = 1;
   static final int IDX_NUM_HIGH_ENROLLERS = 2;
   static final int IDX_NUM_ULTRA_ENROLLERS = 3; 
   
   
   public static void main(String[] args)
   {
       // variables
       // collectors for trainers names in each category
       String lowEnrollers = "";
       String midEnrollers = "";
       String highEnrollers = "";
       String ultraEnrollers = "";
       
       // array of trainer names
       String categoryNames[] = { lowEnrollers, midEnrollers, highEnrollers, ultraEnrollers};
       
       int numLowEnrollers = 0;
       int numMidEnrollers = 0;
       int numHighEnrollers = 0;
       int numUltraEnrollers = 0;
    
       // array of category counts
       int categoryCounts[] = { numLowEnrollers, numMidEnrollers, numHighEnrollers, numUltraEnrollers};   
   
       // housekeeping()
       housekeeping();
   
       // process
       process(categoryNames, categoryCounts);

       // extract the returned names in the category
       lowEnrollers = categoryNames[IDX_NUM_LOW_ENROLLERS];
       midEnrollers = categoryNames[IDX_NUM_MID_ENROLLERS];
       highEnrollers = categoryNames[IDX_NUM_HIGH_ENROLLERS];
       ultraEnrollers = categoryNames[IDX_NUM_ULTRA_ENROLLERS];       
       
       // extract the returned category counts        
       numLowEnrollers = categoryCounts[IDX_NUM_LOW_ENROLLERS]; 
       numMidEnrollers = categoryCounts[IDX_NUM_MID_ENROLLERS]; 
       numHighEnrollers = categoryCounts[IDX_NUM_HIGH_ENROLLERS]; 
       numUltraEnrollers = categoryCounts[IDX_NUM_ULTRA_ENROLLERS]; 
   
       // finish
       finish(lowEnrollers, midEnrollers, highEnrollers, ultraEnrollers,
              numLowEnrollers, numMidEnrollers, numHighEnrollers, numUltraEnrollers);
   
   }  // end main()
   
   public static void housekeeping() {
       System.out.println("This program grades the trainer's enrollment. ");
   } // end housekeeping()
   
   public static void process(String categoryNames[], int categoryCounts[]) {
   
       // local variables
       // initialize to first time for each category
       Boolean lowFirst = true;
       Boolean midFirst = true;
       Boolean highFirst = true;
       Boolean ultraFirst = true;
       
       String lowEnrollers = "";
       String midEnrollers = "";
       String highEnrollers = "";
       String ultraEnrollers = "";
       
       int numLowEnrollers = 0;
       int numMidEnrollers = 0;
       int numHighEnrollers = 0;
       int numUltraEnrollers = 0;       

   
       for(int i=0; i <= SIZE-1; i++){
   
         // convert enrollment count to string
         //std::ostringstream ss;
         //ss << ANNUAL_ENROLLMENT[i];
         // if enrolled is in low range
         if (LOW_MIN <= ANNUAL_ENROLLMENT[i] && ANNUAL_ENROLLMENT[i] <= LOW_MAX ) {
           // save the name of the trainer
           if (lowFirst){
               lowEnrollers = lowEnrollers + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numLowEnrollers = numLowEnrollers + 1;  // bump the count in this group
               // no longer first
               lowFirst = false;
           } else {
               lowEnrollers = lowEnrollers + ", " + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numLowEnrollers = numLowEnrollers + 1;  // bump the count in this group
           }
         }
         else if (MID_MIN <= ANNUAL_ENROLLMENT[i] && ANNUAL_ENROLLMENT[i] <= MID_MAX ) {
           // save the name of the trainer
           if (midFirst){
               midEnrollers = midEnrollers + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numMidEnrollers = numMidEnrollers + 1;  // bump the count in this group
               // no longer first
               midFirst = false;
           } else {
               midEnrollers = midEnrollers + ", " + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numMidEnrollers = numMidEnrollers + 1;  // bump the count in this group
           }
         }
         else if (HIGH_MIN <= ANNUAL_ENROLLMENT[i] && ANNUAL_ENROLLMENT[i] <= HIGH_MAX ) {
           // save the name of the trainer
           if (highFirst){
               highEnrollers = highEnrollers + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numHighEnrollers = numHighEnrollers + 1;  // bump the count in this group
               // no longer first
               highFirst = false;
           } else {
               highEnrollers = highEnrollers + ", " + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numHighEnrollers = numHighEnrollers + 1;  // bump the count in this group
           }
         }
         else {
           if (ultraFirst){
               ultraEnrollers = ultraEnrollers + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numUltraEnrollers = numUltraEnrollers + 1;  // bump the count in this group
               // no longer first
               ultraFirst = false;
           } else {
               ultraEnrollers = ultraEnrollers + ", " + TRAINERS[i] + "(" + ANNUAL_ENROLLMENT[i] + ")";
               numUltraEnrollers = numUltraEnrollers + 1;  // bump the count in this group
           }
         }
       }  // end for
       
       // capture the names in the category
       categoryNames[IDX_NUM_LOW_ENROLLERS] = lowEnrollers; 
       categoryNames[IDX_NUM_MID_ENROLLERS] = midEnrollers; 
       categoryNames[IDX_NUM_HIGH_ENROLLERS] = highEnrollers; 
       categoryNames[IDX_NUM_ULTRA_ENROLLERS] = ultraEnrollers;        
       
       // capture the categoryCounts
       categoryCounts[IDX_NUM_LOW_ENROLLERS] = numLowEnrollers; 
       categoryCounts[IDX_NUM_MID_ENROLLERS] = numMidEnrollers; 
       categoryCounts[IDX_NUM_HIGH_ENROLLERS] = numHighEnrollers; 
       categoryCounts[IDX_NUM_ULTRA_ENROLLERS] = numUltraEnrollers;        
       
   } // end process()
   
   public static void finish(String lowEnrollers, String midEnrollers, String highEnrollers, String ultraEnrollers,
               int numLowEnrollers, int numMidEnrollers, int numHighEnrollers, int numUltraEnrollers) {
   
       // print the results
       System.out.println("Those who enrolled from,... ");
       System.out.println(LOW_MIN + " to " + LOW_MAX + " - " + numLowEnrollers + " trainers");
       System.out.println("\t" + lowEnrollers);
       System.out.println(MID_MIN + " to " + MID_MAX + " - " + numMidEnrollers + " trainers");
       System.out.println("\t" + midEnrollers);
       System.out.println(HIGH_MIN + " to " + HIGH_MAX + " - " + numHighEnrollers + " trainers");
       System.out.println("\t" + highEnrollers);
       System.out.println("...over " + HIGH_MAX + " - " + numUltraEnrollers + " trainers");
       System.out.println("\t" + ultraEnrollers);
   
       System.out.println("End of job");
   // return
   } // end finish()

}  // end class




