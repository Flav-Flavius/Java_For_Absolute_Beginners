import java.util.Scanner;

class SumOfTheDigitsWithWhile {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        System.out.println("Enter a number: ");
        number = myObj.nextInt();

        if (number > 0 && number <= 9999) {
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println("Sum of digits is: " + sum);
        } else {
            System.out.println("Invalid number");
        }
    }
}

