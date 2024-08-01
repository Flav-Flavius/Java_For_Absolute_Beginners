
import java.util.Scanner;

public class TwoWayDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pasul 2: Citirea valorii day de la utilizator
        System.out.print("Introduceti un numar pentru zi (1-7): ");
        int day = scanner.nextInt();

        // Declararea variabilei dayName pentru a stoca numele zilei
        String dayName = "";

        // Pasul 3: Decizie pentru determinarea numelui zilei
        if (day == 1) {
            // True branch pentru day == 1
            dayName = "Sunday";
        } else if (day == 2) {
            // True branch pentru day == 2
            dayName = "Monday";
        } else if (day == 3) {
            // True branch pentru day == 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // True branch pentru day == 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // True branch pentru day == 5
            dayName = "Thursday";
        } else if (day == 6) {
            // True branch pentru day == 6
            dayName = "Friday";
        } else if (day == 7) {
            // True branch pentru day == 7
            dayName = "Saturday";
        } else {
            // False branch pentru valori care nu sunt în intervalul 1-7
            dayName = "Invalid day";
        }

        // Pasul 4: Afișarea rezultatului
        System.out.println("Numele zilei este: " + dayName);
        scanner.close();
    }
}

/* One-way decision ( o decizie unidirectionala ) utilizeaza doar o clauza if.  Daca conditia
este adevarata, se executa un set de instructiuni. Daca conditia este falsa, nu se executa
nimic. EXEMPLU : if (day == 1) {
            // True branch pentru day == 1
            dayName = "Sunday"; }
 Two-way decision ( o decizie bidirectionala ) utilizezaza o clauza "if-else" sau "if-else if".
 Daca conditia este adevarata, se executa un set de instructiuni, daca este falsa, se
 executa un alt set de instructiuni. Precum in codul de mai sus
 */