// A program that sum the values provided by the user

package WhileLoop_SentinelLoop;

import java.util.Scanner;

public class SumTheValues {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = 1;  // Initializing a with 1 to ensure that the loop executes at least once
        int sum = 0;

        while (a != 0) // This loop will terminate when the value of a is zero
        {   
            System.out.println("Enter the number: ");
            a = myObj.nextInt();  // Taking input from user in variable a
            sum += a; // Calculate sum and update sum value
        }
        System.out.println("Sum is: " + sum);
        myObj.close();
    }

}
