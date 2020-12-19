//This was also converted from C++ to java
//This is correct but adds much more manual programming than needed to accomplish the task
import java.util.Scanner;

public class Ex4TrainersArray  
{
   // CONSTANTS
   // global CONSTANTS
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
   
   static final String EMPTY_NAME = "*";
   static final int EMPTY_COUNT = -1;
   
   
   
   public static void main(String[] args)
   {
       // variables
       // collectors for trainers names in each category
   
       String lowEnrollers [] = {EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME};
   
       int lowEnrollersCount [] = {EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT};
   
       String midEnrollers [] = {EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME};
   
       int midEnrollersCount [] = {EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT};
   
       String highEnrollers [] = {EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME};
   
       int highEnrollersCount [] = {EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT};
   
       String ultraEnrollers [] = {EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME,
                                 EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME, EMPTY_NAME};
   
       int ultraEnrollersCount [] = {EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT,
                                   EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT, EMPTY_COUNT};
   
       int numLowEnrollers = 0;
       int numMidEnrollers = 0;
       int numHighEnrollers = 0;
       int numUltraEnrollers = 0;
       
       // array of category counts
       int categoryCounts[] = { numLowEnrollers, numMidEnrollers, numHighEnrollers, numUltraEnrollers};
   
       // housekeeping()
       housekeeping();
   
       // process
       process(lowEnrollers, midEnrollers, highEnrollers, ultraEnrollers,
               lowEnrollersCount, midEnrollersCount, highEnrollersCount, ultraEnrollersCount,
               categoryCounts);
       
       // extract the returned category counts        
       numLowEnrollers = categoryCounts[IDX_NUM_LOW_ENROLLERS]; 
       numMidEnrollers = categoryCounts[IDX_NUM_MID_ENROLLERS]; 
       numHighEnrollers = categoryCounts[IDX_NUM_HIGH_ENROLLERS]; 
       numUltraEnrollers = categoryCounts[IDX_NUM_ULTRA_ENROLLERS];        
       
       // finish
       finish(lowEnrollers, midEnrollers, highEnrollers, ultraEnrollers,
              lowEnrollersCount, midEnrollersCount, highEnrollersCount, ultraEnrollersCount,
              numLowEnrollers, numMidEnrollers, numHighEnrollers, numUltraEnrollers);
   
   }  // end main()
   
   public static void housekeeping() {
       System.out.println("This program grades the trainer's enrollment. ");
   } // end housekeeping()
   
   public static void process(String lowEnrollers[], String midEnrollers[], String highEnrollers[], String ultraEnrollers[],
                int lowEnrollersCount[], int midEnrollersCount[], int highEnrollersCount[], int ultraEnrollersCount[],
                int categoryCounts[]) {
                
                
       int numLowEnrollers = 0;
       int numMidEnrollers = 0;
       int numHighEnrollers = 0;
       int numUltraEnrollers = 0;
   
       for(int i=0; i <= SIZE-1; i++){
   
         // convert enrollment count to string
         // if enrolled is in low range
         if (LOW_MIN <= ANNUAL_ENROLLMENT[i] && ANNUAL_ENROLLMENT[i] <= LOW_MAX ) {
           // save the name of the trainer
           lowEnrollers[numLowEnrollers] = TRAINERS[i];
           // save their enrollment count
           lowEnrollersCount[numLowEnrollers] = ANNUAL_ENROLLMENT[i];
           numLowEnrollers = numLowEnrollers + 1;
         }
         else if (MID_MIN <= ANNUAL_ENROLLMENT[i] && ANNUAL_ENROLLMENT[i] <= MID_MAX ) {
           // save the name of the trainer
           midEnrollers[numMidEnrollers] = TRAINERS[i];
           // save their enrollment count
           midEnrollersCount[numMidEnrollers] = ANNUAL_ENROLLMENT[i];
           numMidEnrollers = numMidEnrollers + 1;
         }
         else if (HIGH_MIN <= ANNUAL_ENROLLMENT[i] && ANNUAL_ENROLLMENT[i] <= HIGH_MAX ) {
           // save the name of the trainer
           highEnrollers[numHighEnrollers] = TRAINERS[i];
           // save their enrollment count
           highEnrollersCount[numHighEnrollers] = ANNUAL_ENROLLMENT[i];
           numHighEnrollers = numHighEnrollers + 1;
         }
         else {
           // save the name of the trainer
           ultraEnrollers[numUltraEnrollers] = TRAINERS[i];
           // save their enrollment count
           ultraEnrollersCount[numUltraEnrollers] = ANNUAL_ENROLLMENT[i];
           numUltraEnrollers = numUltraEnrollers + 1;
         }
       }  // end for
       // capture the categoryCounts
       categoryCounts[IDX_NUM_LOW_ENROLLERS] = numLowEnrollers; 
       categoryCounts[IDX_NUM_MID_ENROLLERS] = numMidEnrollers; 
       categoryCounts[IDX_NUM_HIGH_ENROLLERS] = numHighEnrollers; 
       categoryCounts[IDX_NUM_ULTRA_ENROLLERS] = numUltraEnrollers; 

   } // end process()
   
   public static void  finish(String lowEnrollers[], String midEnrollers[], String highEnrollers[], String ultraEnrollers[],
               int lowEnrollersCount[], int midEnrollersCount[], int highEnrollersCount[], int ultraEnrollersCount[],
               int numLowEnrollers, int numMidEnrollers, int numHighEnrollers, int numUltraEnrollers) {
   
       // print the results
       System.out.println("Those who enrolled from,... ");
       System.out.println(LOW_MIN + " to " + LOW_MAX + " - " + numLowEnrollers + " trainers");
       System.out.print("\t");
       for(int i=0; i < numLowEnrollers; i++){
           System.out.print(lowEnrollers[i] + "(" + lowEnrollersCount[i] + ")");
           if (i<numLowEnrollers-1) { System.out.print(","); }  // don't put a comma on the very last one
       }
       System.out.println();
       System.out.println(MID_MIN + " to " + MID_MAX + " - " + numMidEnrollers + " trainers");
       System.out.print("\t");
       for(int i=0; i < numMidEnrollers; i++){
           System.out.print(midEnrollers[i] + "(" + midEnrollersCount[i] + ")");
           if (i<numMidEnrollers-1) { System.out.print(","); }  // don't put a comma on the very last one
       }
       System.out.println();
       System.out.println(HIGH_MIN + " to " + HIGH_MAX + " - " + numHighEnrollers + " trainers");
       System.out.print("\t");
       for(int i=0; i < numHighEnrollers; i++){
           System.out.print(highEnrollers[i] + "(" + highEnrollersCount[i] + ")");
           if (i<numHighEnrollers-1) { System.out.print(","); }  // don't put a comma on the very last one
       }
       System.out.println();
       System.out.println("...over " + HIGH_MAX + " - " + numUltraEnrollers + " trainers");
       System.out.print("\t");
       for(int i=0; i < numUltraEnrollers; i++){
           System.out.print(ultraEnrollers[i] + "(" + ultraEnrollersCount[i] + ")");
           if (i<numUltraEnrollers-1) { System.out.print(","); }  // don't put a comma on the very last one
       }
   
       System.out.println("\n" + "End of job");
   // return
   } // end finish()
   
}  // end class   