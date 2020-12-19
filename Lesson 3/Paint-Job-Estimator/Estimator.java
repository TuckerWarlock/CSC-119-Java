import java.util.Scanner;

public class Estimator {
    final public Scanner INPUT = new Scanner(System.in);
    //local variables
    double squareFeet;
    double pricePerGallon;
    double numGallons;
    double laborHours;
    double laborCost;
    double paintCost;
    double totalCost;

    //INPUT
    //get user input for number of square feet
    public void getSquareFeet(){
        System.out.println("Enter the number square feet to paint: ");
        this.squareFeet = INPUT.nextDouble();
    }//end getSquareFeet()

    //INPUT
    //get user input for price per gallon
    public void getPaintPrice(){
        System.out.println("Enter the price per gallon of paint: ");
        this.pricePerGallon = INPUT.nextDouble();
    }//end getPaintPrice()

    //PROCESS
    //calculate labor cost and price per sq. ft
    public void calculatePaintAndLabor(){
        this.numGallons = squareFeet/115;
        System.out.println("Number of Gallons: " + numGallons);
        this.laborHours = numGallons * 8;
        System.out.println("Number of Hours: " + laborHours);
        this.paintCost = numGallons * pricePerGallon;
        System.out.println("Price of Paint: $" + paintCost);
        this.laborCost = laborHours * 20.00;
        System.out.println("Price of Labor: $" + laborCost);
        this.totalCost = paintCost + laborCost;
        System.out.println("Total Cost: $" + totalCost);

    }//end calculateLaborAndSQFT()

    //OUTPUT
    //display output from calculations and user input
    public static void main(String[] args) {
        System.out.println("Welcome to the Paint Estimator!");

        Estimator estimator = new Estimator();
        estimator.getSquareFeet();
        estimator.getPaintPrice();
        estimator.calculatePaintAndLabor();

        estimator.INPUT.close(); //close scanner

    }//end main()
}//end Estimator class
