Tic-Tac-Toe Win Checker

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
