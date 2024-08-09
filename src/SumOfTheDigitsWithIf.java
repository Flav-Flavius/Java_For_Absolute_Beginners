// This program takes an input number and displays the sum of its digits

import java.util.Scanner;

class SumOfTheDigitsWithIf {
    public static void main(String args[]) {
        // Crearea unui obiect Scanner pentru a citi de la tastatura
        Scanner myObj = new Scanner(System.in);

        // Initializarea variabilelor pentru suma cifrelor si numarul introdus
        int sum = 0;
        int number = 0;  // Se initializeaza chiar daca imediat se va suprascrie

        // Solicitarea unui numar de la utilizator, cu cel mult 4 cifre
        System.out.println("Enter a number with at most 4 digits: ");
        number = myObj.nextInt(); // Citirea numarului

        // Verificarea daca numarul este in intervalul 0 - 9999
        if (number > 0 && number <= 9999) 
        {
            // Adaugarea ultimei cifre a numarului la suma
            sum += number % 10; // Adaugarea restului impartirii la 10 (ultima cifra)
            number = number / 10; // Eliminarea ultimei cifre din numar

            // Repetarea adaugarii cifrelor daca numarul are mai mult de o cifra
            if (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            // Afisarea sumei cifrelor
            System.out.println("Sum of digits is: " + sum);
        } else 
        {
            // Afisarea unui mesaj de eroare daca numarul nu este valid
            System.out.println("Invalid number");
        }
        myObj.close();
    }
}

/* In general, "number % 10" va extrage ultima cifra a oricarui numar intreg, indiferent de lungime,
deoarece acest operator modulo returneaza restul impartirii numarului la "10".
   Sa presupunem ca se introduce numarul 376:
   1. Initial 'number = 376'
      'sum += number % 10' -> 'sum += 6' -> 'sum = 6' (deoarece initial sum = 0 , la care se adauga
ultima cifra extrasa a numarului)
      'number = number / 10' -> 'number = 376 / 10' -> 'number = 37'
   2. A doua verificare: 'number = 37'
      'sum += number % 10' -> 'sum += 7' -> 'sum = 6 + 7' -> sum = 13
      'number = number / 10' -> 'number = 37 / 10' -> 'number = 3'
   3. A treia verificare: 'number = 3'
      'sum += number % 10' -> 'sum += 3' -> sum = 13 + 3' -> 'sum = 16'
      'number = number / 10' -> 'number = 3 / 10' -> 'number = 0'
    4. Incheiere deoarece number devine 'number = 0' si nu mai este evaluata ca true conditia lui if
 */