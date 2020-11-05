# Paint-Job-Estimator

A painting company has determined that for every 115 square feet of wall space, one gallon of paint and eight hours of labor are required.  The company charges $20.00 per hour for labor.  Design a modular program that asks the user to enter the square feet of wall space to be painted and the price of the paint per gallon.  The program should display the following data:

* the number of gallons of paint required
* the hours of labor required
* the cost of the paint
* the labor charges
* the total cost of the paint job

### example output:

> Enter the number of square feet to paint. 115

> Enter the price of a gallon of paint. 1

```
number of gallons:         1
  number of hours:       8.0
            paint:     $1.00
            labor:   $160.00
       total cost:   $161.00
```

###### An approach:
(INPUT) Call a module to get the square feet to paint from the user. 
(INPUT) Call a module to get the price of the paint from the user.
(PROCESS) Call a module from main() with the square feet and gallons of paint passed as parameters which calculates and returns the required gallons and labor in reference parameters. 
(PROCESS/OUTPUT) Call another module passing the gallons required and labor required as parameters which calculates and displays the costs (paint, labor and total).
