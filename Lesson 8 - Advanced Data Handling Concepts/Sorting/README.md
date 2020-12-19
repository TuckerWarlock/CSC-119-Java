# Sorting and Searching Arrays
Write an application that perform the bubble sort, selection sort, and insertion sort algorithms on an Integer array, such that each method keeps a count of the number of swaps it makes. 

### Part 1 - Sorting Arrays
> Design an application that uses three identical arrays of at least 20 integers.  It should call each module on a different array, and display the number of swaps made by each algorithm. 

Sorting Benchmarks (bubble, selection & insertion sort)
> The following represents the output from 3 separate files: BubbleSort, SelectSort and InsertionSort. 
* Don't ask the user to enter any numbers, but 'hard code' the values in the "Original order" as shown. 
```
Original order:
26 45 56 12 78 74 39 22 5 90 87 32 28 11 93 62 79 53 22 51
Bubble Sorted:
5 11 12 22 22 26 28 32 39 45 51 53 56 62 74 78 79 87 90 93
Number of location swaps: 89
```

```
Original order:
26 45 56 12 78 74 39 22 5 90 87 32 28 11 93 62 79 53 22 51
Selection Sorted:
5 11 12 22 22 26 28 32 39 45 51 53 56 62 74 78 79 87 90 93
Number of location swaps: 19
```

```
Original order:
26 45 56 12 78 74 39 22 5 90 87 32 28 11 93 62 79 53 22 51
Insertion Sorted:
5 11 12 22 22 26 28 32 39 45 51 53 56 62 74 78 79 87 90 93
Number of location swaps: 19
```

### Part 2 - Searching Arrays
> Design an application that has an array of at least 20 integers.  It should call a module that uses the sequential search algorithm to locate one of the values.  The module should keep a count of the number of comparisons it makes until it finds the value.  Then the program should call another module that uses the binary search algorithm to locate the same value.  It should also keep a count of the number of comparisons it makes.  Display these values on the screen. 

Searching Benchmarks (integer array search)
> Modify the textbook instructions as follows:
* Use the output of one of the array sorting algorithms from the previous application.  Search the resulting sorted array using both the Sequential search and Binary search.  Count and display the number of comparisons in both cases.  Use a loop to allow multiple selections without having to restart the program. 
```
Original order:
26 45 56 12 78 74 39 22 5 90 87 32 28 11 93 62 79 53 22 51
Bubble Sorted:
5 11 12 22 22 26 28 32 39 45 51 53 56 62 74 78 79 87 90 93
Number of location swaps: 89
Select a number in the Array to search for: 45
Sequential Search comparisons: 10
The position of the number is 10
Binary Search comparisons: 1
The position of the number is 10
Do you want to search again? (Y=Yes) y
Select a number in the Array to search for: 74
Sequential Search comparisons: 15
The position of the number is 15
Binary Search comparisons: 2
The position of the number is 15
Do you want to search again? (Y=Yes) n
```