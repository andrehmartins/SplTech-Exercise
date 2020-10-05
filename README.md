# SplTech-Exercise
SplTech job interview exercise

Ex1
Started by creating the class Rack, which has the methods for sorting and adding new balls.
First it's asked to the user what is the number drawned, and after writing it, it is printed the numbers of the balls that are in the rack.
The sorting algorithm used is an insertion sort because we have a reduced numbers of balls to sort (60 balls max) and when we add a new ball the rack is sorted, so it's time complexity is O(n), it's efficient.

Ex2
After reading the number, check left to right if start in millions, thousands, hundreds, dozens or decimals. After that write the numbers with words.
There are some special cases like from ten to nineteen, when it's only twenty, thirty, etc and when it's twenty-one, twenty-two, etc, when to write 'thousand' or not.
