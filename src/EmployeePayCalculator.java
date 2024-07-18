// This program should calculate the pay of an employee based on hours worked
import java.util.Scanner;

public class EmployeePayCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the total working hours:");
        int hours = myObj.nextInt();
        System.out.println("Enter the hourly pay rate: ");
        double payRate = myObj.nextDouble();
        double regularPay;
        if (hours <= 40) 
        {
            regularPay = hours * payRate;
            System.out.println("Regular pay: " + regularPay);
        }
        else
        {
            regularPay = 40 * payRate;
            double overTime = hours - 40;
            double increasePay = ( payRate + (payRate / 2));
            double extraPay = increasePay * overTime;
            System.out.println("Regular pay: " + regularPay);
            System.out.println("Overtime pay: " + extraPay);
            System.out.println("Total pay: " + (regularPay + extraPay));
        }
    }

}
