// This is a program that tells a story with information given by user

import java.util.Scanner;
public class UseOfScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Creeaza un obiect al clasei Scanner
        System.out.print("Enter user's name: ");
        String userName = myObj.nextLine();

        System.out.print("Enter user's age: ");
        String userAge = myObj.nextLine();

        System.out.print("Enter user's city: ");
        String userCity = myObj.nextLine();

        System.out.print("Enter user's college: ");
        String userCollege = myObj.nextLine();

        System.out.print("Enter user's profession: ");
        String userProfession = myObj.nextLine();

        System.out.print("Enter user's pet name: ");
        String petName = myObj.nextLine();

        System.out.print("There once was a person named " + userName);
        System.out.print(" who lived in " + userCity);
        System.out.print(". At the age of " + userAge);
        System.out.print(", " + userName + " went to the college at " + userCollege);
        System.out.print(". " + userName + " graduated and went to work as a " + userProfession);
        System.out.print(". Then, " + userName + " adopted an animal named " + petName);
        System.out.print(".They both lived happily ever after!");
    }

}


/* Ca sa putem utiliza clasa Scanner, trebuie creat un obiect (myObj in acest caz)
   System.in reprezinta fluxul standard de intrare
   nextLine() este folosit pentru a citi o linie intreaga de text si returneaza rezultatul sub
   forma unui String
 */