
// A program that takes an integer input by the user and prints a multiplication table
package ForLoop;

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = myObj.nextInt();
        int result;
        for (int i = 1; i < 11; i++) {
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
        myObj.close();
    }
}
