lab 1 - Tic-Tac-Toe Win Checker

Create a program that checks for a winning condition in a Tic-Tac-Toe game. Your program should
be called CheckWin.java and it should define a single class, CheckWin, inside the lab1 package. The
program should take a set of numeric moves as input.

Board Representation:
012
345
678

Each move represents a played position. The program should output who wins, X or O, with X going
first. For example, if the input is:

0123456

It should output:

X wins on a diagonal

Requirements:
• Your program should check for win conditions (in the order: rows, columns, diagonals) and output
the first win it finds. Check top to bottom, left to right.
• The program should output only one win condition.
• Do not process anything for a draw.
• The board will always be a 3x3 grid.
• It should report the win for the player who last played.
• You may assume valid inputs in this specific case

lab 2 - Inheritance with Abstract Classes and Interfaces

Code all the classes (abstract and concrete) and interfaces shown in the diagram. The ‘toString‘
methods should describe the state of the class. Other methods should use ‘System.out.println‘ to print
something appropriate to amuse your lab markers.

Create a ‘Driver.java‘ class whose ‘main‘ method instantiates each concrete class and calls each method.
Add comments indicating what is being called and how polymorphism or inheritance are being used.

All your Java classes should be in the ‘lab2‘ package. Zip the ‘lab2‘ folder containing all your Java files
for submission.

NOTE: If you do not complete your lab during the lab period and go to a separate lab period, you will
likely have a different lab.

lab 3 - Polymorphism and Interfaces

Objective
In this lab, you will create a simple library system where books can be checked out and returned. This
exercise will reinforce your understanding of polymorphism and interfaces.

Instructions
1. Create Interfaces and Classes:
• Create an interface Borrowable with methods checkOut and returnItem.
• Create an abstract class LibraryItem with fields title, author, and methods toString and getDetails.
• Create two concrete classes Book and Magazine that extend LibraryItem and implement Borrowable.

2. Implement the Borrowable Interface:
• Implement the checkOut and returnItem methods in Book and Magazine.

3. Driver Class:
• Use the provided Driver class that demonstrates polymorphism by creating an array of Borrowable items (some Book, some Magazine), checking out and returning items.
• The Driver class takes one line of input with two integers, the number of Books and the number of Magazines. The books and magazines are then read from standard in.

4. Expected Output:
• The main method should output the status of each item before and after check-out and return, and verify the type using instanceof.

lab 4 - File IO and Exceptions

Objective:
Write a program that reads a list of students from a text file, processes the data based on user input,
and writes the output to a second file. The program should handle various exceptions during execution.

Task:
You will have input files formatted with the following fields:

StudentID, Grade, Name

An example of that might be students.txt (included here)”

49403477, 57.87, Yedidia Chamandi
44237670, 59.23, Affan Ross
45810297, 24.38, Andrea Asencios
42208695, 84.53, Hanad-Keysse Zakaria
43100145, 73.49, Guanchen Peerthum

Your program will prompt the user for a filename and load the file, creating a list of Students with
appropraite fields. You may use an array of Students or some form of List of students if you already
know how, but you should not change the order. The Student class should be in the lab4 package. If
there is an error in parsing you should throw an Exception. If there is no error, the driver will ask the
user for an output filename and a line number, and then output all rows except that one to the file.

Exceptions:

An example of that might be students.txt with errors (included here)”

41217567, 29.52, Mehrad Patel
28898266, 54.80, Jad Yew-Hin
24148326, 15.28, Mahir Sato
26976695, 25.40, Olivier Abusamhadaneh
2036325, nx.zt,

Driver:

A Driver.java file is included in the assignment zip within the driver package. This file must not be
changed and should be consulted for understanding how your program is expected to run and output
clear messages based on the program’s execution. The lab markers will run this with the good and bad
example and should attempt to break other things.

DebugRunner
See instructions for Assignment 3. Once again you can just run DebugRunner and it’ll tell you how
you’re doing. If the lab instructor can run your DebugRunner successfully, you’re done.

prj> java DebugRunner

where prj> is meant to indicate a prompt telling you you’re in the prj folder.


