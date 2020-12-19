# Trainer's enrollment
Trainers at Tom's Athletic Club are encouraged to enroll new members.  Write an application that extracts the names of Trainers and groups them based on the number of new members each trainer has enrolled this year.  Output is the number of trainers who have enrolled 0 to 5 members, 6 to 12 members, 13 to 20 members, and more than 20 members.  Give their names as well as the number of members they have enrolled.   

###### Use this list of trainers:
```
{"Jake Butt", "Ziggy Hood", "Hroniss Grasu", "Vontaze Burfict", "Jaquiski Tartt",
"Ndamukong Suh", "Thurston Armbrister", "Captain Munnerlyn", "Barkevious Mingo", "Ha Ha Clinton-Dix",
"Mister Alexander", "BenJarvus Green-Ellis", "Richie Incognito", "Champ Bailey", "Captain Munnerlyn",
"Mike Kafka", "Ras-I Dowling", "Bryan Anger", "D'Brickashaw Ferguson", "Rex Hadnot",
"Sage Rosenfels", "Robert Griffin III", "Sav Rocca", "Chad Ochocinco", "Brett Rypien"
}
```
###### Use this list of the number of members each trainer has enrolled:
```
{3, 9, 13, 26, 23,
19, 15, 13, 17, 8,
2, 3, 5, 7, 11,
18, 12, 14, 20, 16,
4, 6, 10, 1, 0
}
```
###### example output:
```
This program grades the trainer's enrollment.
Those who enrolled from,...
0 to 5 - 7 trainers
Jake Butt(3), Mister Alexander(2), BenJarvus Green-Ellis(3), Richie Incognito(5), Sage Rosenfels(4), Chad Ochocinco(1), Brett Rypien(0)
6 to 12 - 7 trainers
Ziggy Hood(9), Ha Ha Clinton-Dix(8), Champ Bailey(7), Captain Munnerlyn(11), Ras-I Dowling(12), Robert Griffin III(6), Sav Rocca(10)
13 to 20 - 9 trainers
Hroniss Grasu(13), Ndamukong Suh(19), Thurston Armbrister(15), Captain Munnerlyn(13), Barkevious Mingo(17), Mike Kafka(18), Bryan Anger(14), D'Brickashaw Ferguson(20), Rex Hadnot(16)
...over 20 - 2 trainers
Vontaze Burfict(26), Jaquiski Tartt(23)

End of job
```
###### an approach:

> Create "buckets" to represent the enrollment groupings.  The "buckets" can be implemented by using additional parallel arrays (like the master list - one array for the trainer, another for their enrollment). 

> After examining each item in the master list of trainers, they can be placed in one of the subset "buckets" (both the the trainer's name and the number of people they have enrolled).  After walking through the master list, the trainers and their enrolled will be distributed among the "buckets". 

The output is formed by simply extracting the information from the appropriated "bucket". 

### Solutions:
The TrainerEnrollment.java accomplishes the task but "gutted" the Main method to accomplish this.
The Ex4Trainers.java was converted from C++ and accomplishes the task but is hard to read.
The Ex4TrainersArray.java was also converted from C++ and is even more convoluted than Ex4Trainers.java.