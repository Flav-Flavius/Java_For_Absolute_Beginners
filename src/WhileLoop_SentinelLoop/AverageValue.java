// A program that calculates the average of the numbers provided by the user

package WhileLoop_SentinelLoop;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = 1;
        int inputCount = 0;
        double sum = 0;
        while (a != 0) {
            System.out.println("Enter the number: ");
            a = myObj.nextInt();
            inputCount += 1;
            sum += a;
        }
        if (inputCount > 1) {
            System.out.println("Average of inputs is: " + sum / (inputCount - 1));
        }
        myObj.close();
    }

}

/* Code logic
1. Initialization:
   'int a = 1;' Initializes thr variable 'a' with '1' to ensure that the 'while' loop executes at least once
   'int inputCount = 0;' Initializes an entry counter (contor) to count how many numbers are entered
   'double sum = 0' Initializes the sum to '0'
2. While Loop:
   The loop continues to run as long as 'a' is nt equal to '0'
   Inside the loop, the user is prompted to enter a number
   The entered number is read into the variable 'a'.
   The entry counter 'inputCount' is incremented.
   The entered value is added to 'sum'.
3. Claculating the average:
   After exiting the loop, if 'inputCount' is greater than '1', the average of the entries is calculated and displayed.
   'sum / (inputCount - 1)' is used to calculate the average because the last entered value was '0', which should not be included in the calculation.
 */
