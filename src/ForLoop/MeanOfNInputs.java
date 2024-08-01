// A program that calculates the average of the numbers input by the user

package ForLoop;

import java.util.Scanner;

public class MeanOfNInputs {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many values do you want to enter: ");
        int values = myObj.nextInt();
        double sumOfValues = 0;
        int v;

        for ( int i = 1; i <= values; i++) {
            System.out.println("Enter value # " + i);
            v = myObj.nextInt();
            sumOfValues += v;
        }
        if (values > 0) // Daca 'values = 0' va genera eroare si va arunca o exceprtie "ArithmeticException" 
        System.out.println("The average is: " + (sumOfValues / values));
        myObj.close();
    }

}



/*  Codul explicat pas cu pas:
1. Importam clasa Scanner
2. Definim clasa si metoda principala
3. Creeam un obiect de tip Scanner
4. Afisam un mesaj pentru a cere utilizatorului sa introduca numarul de valori
5. Citeste un numar intreg de la tastatura si il stocheaza in variabila "values"
6. Initializam si declaram variabilele pentru suma si valoare
7. Bucla pentru citirea valorilor si calcularea sumei:
   - este o bucla ce se executa de "values" ori
   - afiseaza mesajul pentru a cere utilizatorului sa introduca valoarea curenta (indexul 'i')
   - citeste valoarea introdusa si o stocheaza in 'v'
   - adauga valoarea curenta la suma totala
8. Calcularea si afisarea mediei:
   - verifica daca numarul de valori este mai mare ca 0 pentru a evita diviziunea prin 0
   - calculeaza media si o afiseaza pe ecran

 */