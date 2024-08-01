// A program that shows whether or not the natural number input by the user is a prime number

package ForLoop;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int num = myObj.nextInt();
        int countFactor = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
            countFactor += 1;
        }
        if (countFactor == 2) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
        myObj.close();
    }

}
