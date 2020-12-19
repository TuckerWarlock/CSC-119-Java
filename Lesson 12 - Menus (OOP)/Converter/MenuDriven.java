/*
Tucker Parker-Warwick
CSC 119 Intro to Programming JAVA
11/15/2020
 */


import java.util.Scanner;

public class MenuDriven 
{ // start class 

  // Create a Scanner object for keyboard input. 
  static Scanner keyboard = new Scanner(System.in); 
  
  // GLOBAL CONSTANTS    
  static final int MENU_RANGE_MIN = 1;
  static final int MENU_RANGE_MAX = 6;
  static final int QUIT = MENU_RANGE_MAX + MENU_RANGE_MIN;  // THIS DOES NOT WORK IF MIN IS NOT 1 

  //main method for executing the program
  public static void main(String[] args) 
  { // start main()  
     
    int menuSelection; // user's menu selection.
 
    do
    { // start while()
       
      displayMenu();  // Display the menu.

      // get the users selection 
      menuSelection = inputAndValidateSelection();
      if (menuSelection != QUIT)
      {
        menuFunction(menuSelection); // process the selection
      }  
    } while (menuSelection != QUIT); // continue or quit based on the selection  
    
    System.out.println("goodBye"); 

  } // end main() 

  public static void displayMenu()
  { // start displayMenu()
    System.out.println("1. Convert inches to centimeters."); 
    System.out.println("2. Convert feet to meters."); 
    System.out.println("3. Convert miles to kilometers.");
    System.out.println("4. Convert kilometers to nautical miles.");
    System.out.println("5. Convert kilometers to astronomical units.");
    System.out.println("6. Convert meters to yards.");
    System.out.println("7. QUIT");
    System.out.println(); 
  } // end displayMenu()
  
  public static int inputAndValidateSelection()
  { // start inputAndValidateSelection()
    int menuSelection;  
    do
    { 
      System.out.print("Enter from " + MENU_RANGE_MIN + " to " + QUIT + ": "); 
      menuSelection = keyboard.nextInt(); 
    } while (!(MENU_RANGE_MIN <= menuSelection && menuSelection <= QUIT));    
    return menuSelection;
  } // end inputAndValidateSelection()
 
  public static void menuFunction(int menuSelection)
  { // start menuFunction()  
  
    // Perform the selected operation. 
    switch(menuSelection)
    { // start switch
      case 1: 
        // Convert inches to centimeters. 
        Inches2CM myInches2CM = new Inches2CM();      
        break; 
 
      case 2: 
        // Convert feet to meters. 
        Feet2Meters myFeet2Meters = new Feet2Meters();                          
        break; 
 
      case 3: 
        // Convert miles to kilometers. 
        Miles2Kilometers myMiles2Kilometers = new Miles2Kilometers();                        
        break;

      case 4:
        // Convert miles to kilometers.
        Kilometers2Nautical myKilometers2Nautical = new Kilometers2Nautical();
        break;

      case 5:
        // Convert miles to kilometers.
        Kilometers2Astro myKilometers2Astro = new Kilometers2Astro();
        break;

      case 6:
        // Convert miles to kilometers.
        Meter2Yard myMeter2Yard = new Meter2Yard();
        break;
        
    } // end switch 
  } // end menuFunction() 
  
} // end class