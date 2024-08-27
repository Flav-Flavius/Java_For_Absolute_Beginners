/* A program that simulates a cinema seating arrangement using a 2D array, following a similar structure as the code in "MatriceBidimensionala".
The program initializes a 2D array representing the cinema seats, simulates the reservation of some seats by marking them with 'X', and then 
prints the seating arrangement. The structure of code uses nested loops, similar to the approach in "MatriceBidimensionala", where outer loop
iterates over the rows, and the inner loop iterates over the column.
 */

package NestedLoops;

public class CinemaHall {
    public static void main(String[] args) {
       // Define a 2D array representing the cinema seating
       String[][] hall = 
       {
        {"1" , "2" , "3"},
        {"4" , "5" , "6"},
        {"7" , "8" , "9"}
       } ;

       //Simulate seat reservation(seats 2, 5, 9 are reserved)
       hall[0][1] = "X"; // Seat 2 (rpw1, column 2)
       hall[1][1] = "X"; //Seat 5 (row 2, column 2)
       hall[2][2] = "X"; // Seat 9 (row 2, column 2)

       // Print the cinema seating arrangement
       for (int i = 0; i < hall.length; i++) 
       {
        for (int j = 0; j < hall[i].length; j++) 
        {
            System.out.print(hall[i][j]);
            if (j < hall[i].length - 1);
            System.out.print(" ");
        }
        System.out.println();
       }

    }

}
