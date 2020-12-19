# Part 1 - Write to File
The Springfork Amateur Golf Club has a tournament every weekend.  The club president has asked you to design two programs.

### A program that will read each player's name and golf score as keyboard input, and then save these as records in a file named golf.txt (each record will have a field for the player's name and a field for the player's score, separated by a comma)
```
Enter a player's name:
Arnold Palmer
Enter the player's score
74
Do you want to enter another record?
Enter y for yes or anything else for no:
y
... 
```

> Store the data as comma separated records.  For example:
```
Arnold Palmer,74
Tiger Woods,69
Sam Snead,89
Micky Mouse,113
```
NOTE: On a windows machine, the file may be read with notepad.  Other operating systems will have similar text editors to check the result.  

# Part 2 - Read from File  
A program that reads the records from the golf.txt file and displays them.

> Quick and "dirty" table without a header

Player Name: Arnold Palmer Score: 74
Player Name: Tiger Woods Score: 69
Player Name: Sam Snead Score: 89
Player Name: Micky Mouse Score: 113
Read data, find the best score
###### Modify program 2 above so that it also displays the name of the player with the best (lowest) golf score. 

> The same output as Part 1 with the best score
```
Player Name: Arnold Palmer Score: 74
Player Name: Tiger Woods Score: 69
Player Name: Sam Snead Score: 89
Player Name: Micky Mouse Score: 113

The player with the best score is Tiger Woods
```