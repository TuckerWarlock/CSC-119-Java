import java.util.ArrayList;

//This program finds the Prime numbers from 0 to 100 and prints a table
public class PrimeNumbers{

    //constants
    private static final int MAX = 100; // MAX amount of numbers to check
    private static final int ROWS = 5; //amount of numbers per ROW

    public static void main(String[] args) {
        //variables
        int index = 0; //keep track of Array list positions
        boolean isPrime; //flag for prime numbers

        //array list to store the prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        //check for prime numbers
        for (int i = 1; i <= MAX; i++) {
            isPrime = isPrime(i);
            if (isPrime) {
                //add prime numbers to Array List
                primeNumbers.add(i);
            }//end IF
        }//end FOR

        //print table header
        System.out.println("Prime numbers from 1 to " + MAX + " are:");
        //loop to iterate through Array List
        for (int j = 0; j < ROWS; j++) {
            //loop to stop printing so Array List is not out of bounds
            while (index < primeNumbers.size()) {
                System.out.print(primeNumbers.get(index) + " ");
                index++;
                //prints new line once 5 numbers are in a row
                if (index % ROWS == 0) {
                    System.out.println();
                }//end IF
            }//end WHILE
        }//end FOR
    }//end Main method

    //method to check if the number is prime or not
    public static boolean isPrime(int num) {
        int remainder;
        for (int i = 2; i <= num / 2; i++) {
            remainder = num % i;
            //if remainder is 0, number to check is not prime
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }//end method isPrime()

}//end class Prime Numbers