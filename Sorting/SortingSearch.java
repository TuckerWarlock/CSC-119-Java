import java.util.Arrays;
import java.util.Scanner;

//This program uses a Bubble Sort to sort an Array
//Once the Array is sorted, the user may search for a value
public class SortingSearch {

    private final static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        //variable to count swaps made
        int numOfSwaps = 0;
        //declare an array of integers
        int[] bubbleArray = new int[]
                {26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11, 93, 62, 79, 53, 22, 51};
        //exit sentinel
        char exit = 'y';
        //user input search number
        int userValue;

        //print original array
        System.out.println("Original Order: ");
        System.out.println(Arrays.toString(bubbleArray));

        //Bubble Sorting to re-arrange Array elements
        int n = bubbleArray.length;
        //iterate over the array comparing adjacent elements
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //if elements not in order, swap them
                if (bubbleArray[j] > bubbleArray[j + 1])  {
                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;
                    numOfSwaps++;
                }//end IF
            }//end FOR loop j
        }//end FOR loop i

        //print the sorted array
        System.out.println("Bubble Sorted: ");
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println("Number of location swaps: " + numOfSwaps);
        System.out.println();

        //loop to get user input and search for Array value
        while(exit == 'y') {

            //user input to search array
            System.out.println("Select a number in the Array to search for: ");
            userValue = INPUT.nextInt();

            //do sequential search
            int count = 0;
            int pos = - 1;
            for(int i = 0; i < bubbleArray.length; i++){
                count++;
                if(bubbleArray[i] == userValue){
                    pos=i;
                    break;
                }
            }
            //print comparisons
            System.out.println("Sequential Search comparisons: " + count);
            //print position
            System.out.println("The position of the number is " + (pos + 1));

            //do binary search
            pos = - 1;
            int l = 0;
            int r = bubbleArray.length - 1;
            count = 0;
            while(l <= r){
                int mid = (l + r) / 2;
                count++;
                if(bubbleArray[mid] == userValue){
                    pos = mid;
                    break;
                }else if(userValue < bubbleArray[mid]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }//end ELSE
            }//end WHILE loop

            //print comparisons
            System.out.println("Binary Search comparisons: " + count);
            //print position
            System.out.println("The position of the number is " + (pos + 1));

            //ask user to input another record
            System.out.println("Do you want to search again? (Y=Yes)");
            //check if user input value equals exit statement
            exit = INPUT.next().charAt(0);
        }//end WHILE loop

    }//end Main() method

}//end Sorting class

