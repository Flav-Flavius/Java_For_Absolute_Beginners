// A program that display the revrse sequence of digits in a positive integer value input by the user

package WhileLoop_SentinelLoop;

import java.util.Scanner;

public class ReverseSequenceOfDigits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = myObj.nextInt();
        int originalNumber = a;
        String result = "";

        while (a > 0)
        {
            result += a % 10;   // Prin autoboxing sau conversie automata
            a /= 10;
        }
        System.out.println(result);

        System.out.println("================");
        
        a = originalNumber;
        while (a > 0) 
        {
            System.out.println(a % 10);
            a /= 10;   
        }
        myObj.close();
    }

}


/* In Java, concatenarea unui String cu un int ( sau orice alt tip de date primitiv) determina conversia automata a valorii primitive intr-un String.
 Java trateaza operatorul '+' diferit atunci cand unul dintre operatori este un String. Daca unul dintre operanzi este un String, celalalt operand este convertit intr-un String
 inainte de a efectua concatenarea. Acest proces este numit conversie automata sau autoboxing
*/