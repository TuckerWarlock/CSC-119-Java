import java.util.Scanner;

//This class contains all the getter and setter methods
public class Cars extends Main{
    //CONTSTANT
    public final static Scanner INPUT = new Scanner(System.in);

    //variables
    int carYear;
    String carMake;
    int speed;

    //get car year from user
    public void getCarYear(){
        //take input from the user
        System.out.print("Enter the car model's year: ");
        carYear = Integer.parseInt(INPUT.nextLine());
    }
    //set car year to instance of class
    public int setCarYear(){
        return this.carYear;
    }

    //get car make from user
    public void getCarMake(){
        System.out.print("Enter the car's make: ");
        carMake = INPUT.nextLine();
    }
    //set car make to instance of class
    public String setCarMake(){
        return this.carMake;
    }

    //get speed, display to user
    public void getSpeed(){
        speed = 0;
        System.out.println("The speed is " + speed);
    }

    //show the car speeding up
    public void accelerate(){
        System.out.println("Let's see what it can do!!");
        System.out.println("The speed is,...");
        //for loop to increase the speed and display it on output window
        for (int i=5;i <=150 ;i+=5 )
        {
            System.out.print(i + " ");
        }
        //asking for stop
        System.out.println("STOP! STOP! Let me OUT!");
    }

    //show the car decelerating
    public void brake(){
        System.out.println("The speed is,...");
        //decrease the speed by 5
        for (int i=150;i >=0 ; i-=5 )
        {
            System.out.print(i + " ");
        }
        System.out.println(); //to print a new line
        System.out.println("Whew. I'll just walk from here - thanks.");
    }
}
