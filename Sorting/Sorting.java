import java.util.Arrays;

public class Sorting {

    private final static int SIZE = 20;

    public static void main(String[] args) {
        //variable to count swaps made
        int numOfSwaps = 0;
        //declare an array size
        int[] intArray = new int[SIZE];

        //call bubbleSort method
        bubbleSort(intArray, numOfSwaps);

        //call selectionSort method
        selectionSort(intArray, numOfSwaps);

        //call insertionSort method
        insertionSort(intArray, numOfSwaps);

    }//end Main() method

    //method uses Bubble Sorting to re-arrange Array elements
    static void bubbleSort(int[] bubbleArray, int x){
        //declare array values
        bubbleArray = new int[]
                {26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11, 93, 62, 79, 53, 22, 51};
        //print original array
        System.out.println("Original Order: ");
        System.out.println(Arrays.toString(bubbleArray));

        int n = bubbleArray.length;
        //iterate over the array comparing adjacent elements
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //if elements not in order, swap them
                if (bubbleArray[j] > bubbleArray[j + 1])  {
                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;
                    x++;
                }//end IF
            }//end FOR loop j
        }//end FOR loop i

        //print the sorted array
        System.out.println("Bubble Sorted: ");
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println("Number of location swaps: " + x);
        System.out.println();
    }//end bubbleSort() method

    //method uses Selection Sorting to re-arrange Array elements
    static void selectionSort(int[] selectionArray, int x){
        //declare array values
        selectionArray = new int[]
                {26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11, 93, 62, 79, 53, 22, 51};
        //print original array
        System.out.println("Original Order: ");
        System.out.println(Arrays.toString(selectionArray));

        int n = selectionArray.length;
        // traverse unsorted array
        for (int i = 0; i < n - 1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (selectionArray[j] < selectionArray[min_idx])
                    min_idx = j;
            // swap minimum element with compared element
            int temp = selectionArray[min_idx];
            selectionArray[min_idx] = selectionArray[i];
            selectionArray[i] = temp;
            x++;
        }//end FOR loop i

        //print the sorted array
        System.out.println("Selection Sorted:");
        System.out.println(Arrays.toString(selectionArray));
        System.out.println("Number of location swaps: " + x);
        System.out.println();
    }//end selectionSort() method

    //method uses Insertion Sorting to re-arrange Array elements
    static void insertionSort(int[] insertionArray, int x){
        //declare array values
        insertionArray = new int[]
                {26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11, 93, 62, 79, 53, 22, 51};
        //print original array
        System.out.println("Original Order: ");
        System.out.println(Arrays.toString(insertionArray));

        int n = insertionArray.length;
        //apply insertion sort algorithm on the array
        for(int i = 1; i < n; i++)   {
            int temp = insertionArray[i];
            int j= i - 1;
            while(j >= 0 && temp <= insertionArray[j])   {
                insertionArray[j + 1] = insertionArray[j];
                j = j - 1;
            }
            insertionArray[j + 1] = temp;
            x++;
        }//end FOR loop i

        //print the sorted array
        System.out.println("Insertion Sorted:");
        System.out.println(Arrays.toString(insertionArray));
        System.out.println("Number of location swaps: " + x);
        System.out.println();
    }//end insertionSort() method

}//end Sorting class
