//Test Driver class
public class Main
{

    public static void main(String[] args) {

        //Create instance of Cars class
        Cars myCar = new Cars();

        //set Car make and model from user
        myCar.getCarYear();
        myCar.getCarMake();

        //get Car Make and model from Cars class
        System.out.println("The model year is " + myCar.setCarYear());
        System.out.println("The make is " + myCar.setCarMake());

        //get speed

        myCar.getSpeed();
        //return line to separate car from speed output
        System.out.println();

        //speed up the car
        myCar.accelerate();

        //slow the car down
        myCar.brake();
        //ensure program exits
        System.exit(0);
    }

}