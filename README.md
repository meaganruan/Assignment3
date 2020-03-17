# Assignment 3 : Movie Titles

Importing csv file:
Downloaded the movies.csv file from MovieLens and imported the file to the project file to access it.


Reading in files:
Created a MovieTitles class as the assignment main class and to read the csv files. 
Imported java.util.* for Lists, and imported java.io.* for reading in files.
Created an ArrayList to store movie data.
Used BufferedReader and FileReader to read in the movies.csv file.
I only took the Title column of the csv file and stored it in an array to transfer it to the ArrayList outside of the while loop (when reading in the file).
I also removed the "title" (column name) from the array so it would not be in the ArrayList.
Closed the Reader.


Movie Node:
I created a Movie class as my node.
It consisted of 4 fields.
Two private String and Int variables. String is for the movie title, while Int is for the Release Year.
Two Movie objects for the left and right children of the Binary Search Tree (BST).

