// A program that shows all the factors of a number provided by the user.

package ForLoop;

import java.util.Scanner;

public class FactorsOfUserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = myObj.nextInt();
        for (int i = 1; i < (num + 1); i++) {  // "i < (num + 1)" este echivalent cu "i <= num"
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

}


/* Factorii unui numar sunt acele numere intregi pozitive care impart acel numar exact, fara sa lase un rest.
Daca 'a' este un factor al lui 'b', atunci 'b' se poate imparti la 'a' fara rest.
   Descrierea executiei:
1. Programul creeaza un obiect "Scanner" numit "myObj" pentru a prelua intrarile utilizatorului
2. Afiseaza mesajul "Enter the number: "
3. Citeste numarul introdus de utilizator si il stocheaza in variabila "num".
4. Initializeaza o bucla "for" care itereaza de la 1 la "num" inclusiv
5. In interiorul buclei, pentru fiecare valoare a lui "i" , verifica daca "i" este un factor al lui "num" ,
adica daca "num % i == 0"
7. Daca 'i este un factor, afiseaza valoarea lui "i'
8. Bucla continua pana cand "i" ajunge la "num"
Programul se incheie odata ce toti factorii lui "num" au fost afisati
 */