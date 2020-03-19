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
Two String and Int variables. String is for the movie title, while Int is for the Release Year.
Two Movie objects for the left and right children of the Binary Search Tree (BST).
Created a constructor for the two private fields.
Created getter and setter methods for all the fields.
For the String getter method, I returned the substring of the whole title String (includes release year).
For the Int getter method, I returned the substring of the numbers in the title String (removes parentheses) and parsed it into an Int.
Created getter and setter methods for the first and second children as well.



MovieBST class:
Created a private Movie object for the root of the tree.
Created the subSet method to filter out movies. The method checks the characters of each string and compares them.
Created an addMovieNode method to add movies into the tree. 
	The addMovieNode method created a new Movie node and then checks if there is already a parent in the tree. If the root does not have a node, it will create a new node. If the root does have a Node, it will be considered the first node. Then I created an infinite while loop to check if the parent node will have a left or right child. If the child node's character at position 0 is less than the parent node, it will go to the left child node. If it is greater than the parent node, it will go to the right child node.



