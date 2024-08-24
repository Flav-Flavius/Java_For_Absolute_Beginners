// A program that shows a square built with asterisks.

package NestedLoops;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the side length of square: ");
        int n = myObj.nextInt();

        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y < n; y++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        myObj.close();
        
    }   
}
