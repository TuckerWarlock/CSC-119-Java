public class FallingDistanceMain {
    /* FORMULAS and CONSTANTS
    distance = (gravity/2) * (time^2)
    d is the distance in meters
    gravity is a constant of is 9.8m/s^2
    t is the amount of time, in seconds that the object has been falling
    */

    //constant
    private static final double GRAVITY = 9.8;

    //Program to calculate and display distance an object falls over time
    public static void main(String[] args) {

        //print table header
        System.out.println("Seconds \t Meters");

        //loop to iterate through time
        for(double time = 1; time < 11; time++) {
            //print table and call method in regards to time
            System.out.println(time + " \t \t " + fallingDistance(time));
        }//end FOR
    }//end main Method()

    //method to perform calculations
    public static double fallingDistance(double time){
        //returns calculation
        return (GRAVITY/2) * (time * time);
    }//end fallingDistance() method

}//end Falling Distance Main class
