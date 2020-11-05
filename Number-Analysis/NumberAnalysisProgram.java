import java.util.Arrays;

public class NumberAnalysisProgram {

    final static int ARRAY_LENGTH = 20;

    public static void main(String[] args) {

        //create new array with given values
        int[] myArray = {26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11, 93, 62, 79, 53, 22, 51};
        //print array to console
        System.out.println("The array was initialized to: \n" + Arrays.toString(myArray));
        
        //Calling getMin() method
        int min = getMin(myArray);
        System.out.println("The lowest number is: " + min);
        //Calling getMax() method
        int max = getMax(myArray);
        System.out.println("The highest number is: " + max);
        //Calling getTotal() method
        int total = getTotal(myArray);
        System.out.println("The total of the numbers is: " + total);
        //Calling getAverage() method
        double average = getAverage(myArray);
        System.out.println("The average of the numbers is: " + average);

    }//end Main()

    // Method for getting the maximum value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }//end IF
        }//end FOR loop
        return maxValue;
    }//end getMax()

    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }//end IF
        }//end FOR loop
        return minValue;
    }//end getMin

    //Method for getting the total value
    public static int getTotal(int[] inputArray){
        int totalValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            totalValue = totalValue + inputArray[i];
        }//end FOR loop
        return totalValue;
    }

    //Method for getting the average value (mean)
    public static double getAverage(int [] inputArray){
        double averageValue = inputArray[0];
        double totalValue = 0;
        for(int i = 0; i < inputArray.length; i++){
            totalValue = totalValue + inputArray[i];
            averageValue = totalValue/ARRAY_LENGTH;
        }//end FOR loop

        return averageValue;
    }

}//end NumberAnalysisProgram
