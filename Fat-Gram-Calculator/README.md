# 3 Fat Gram Calculator
Design a program that asks for the number of fat grams and calculates the calories in a food item.  Validate the input as follows:

> Make sure the number of fat grams and calories is not less than 0.
According to nutritional formulas, the number of (total) calories MUST exceed fat grams X 9 (otherwise the meal is ALL fat).  
Make sure that the number of (total) calories entered IS greater than fat grams X 9.
Once correct data has been entered the program should calculate and display the percentage of calories that come from fat.  
Use the following formula:
Percent of calories from fat = (Fat grams X 9) / Calories
Some nutritionist classify a food as "low fat" if less than 30 percent of the calories come from fat.  
If the results of this formula are less than 0.3, the program should display a message indicating the food is low fat.

###### example output:
```
This program calculates the % of calories from fat in a food,
    and signals when a food is low fat.
When asked,...
    enter the number of fat grams and calories in the food.

Enter the number of fat grams (not less than 0.0 grams)
-1
Enter the number of fat grams (not less than 0.0 grams)
4
Enter the number of calories (MUST exceed 36.0 (fat grams X 9.0))
30
Enter the number of calories (MUST exceed 36.0 (fat grams X 9.0))
100
The percentage of fat in this food is 36.0%.
Press 'c' to continue OR 'q' to QUIT
c
Enter the number of fat grams (not less than 0.0 grams)
3
Enter the number of calories (MUST exceed 27.0 (fat grams X 9.0))
100
This food is considered low fat because the percentage of fat: 27.0%, is below 30.0%.
Press 'c' to continue OR 'q' to QUIT
q
Good Bye
```
 