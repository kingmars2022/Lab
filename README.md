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

