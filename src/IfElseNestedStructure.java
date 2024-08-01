import java.util.Scanner;

public class IfElseNestedStructure
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start
        // Citirea valorilor a, b și c de la utilizator
        System.out.print("Introduceti valoarea pentru a: ");
        int a = scanner.nextInt();
        System.out.print("Introduceti valoarea pentru b: ");
        int b = scanner.nextInt();
        System.out.print("Introduceti valoarea pentru c: ");
        int c = scanner.nextInt();

        // Variabila pentru stocarea valorii maxime
        int max;

        // Pasul 3: Decizie pentru determinarea valorii maxime
        if (a > b) {
            // True branch: dacă a este mai mare decât b
            if (a > c) {
                // True branch: dacă a este mai mare decât c
                max = a;
            } else {
                // False branch: dacă a nu este mai mare decât c
                max = c;
            }
        } else {
            // False branch: dacă a nu este mai mare decât b
            if (b > c) {
                // True branch: dacă b este mai mare decât c
                max = b;
            } else {
                // False branch: dacă b nu este mai mare decât c
                max = c;
            }
        }

        // Pasul 4: Afișarea rezultatului
        System.out.println("Valoarea maxima este: " + max);
        scanner.close();
    }
}

/* Acest cod detremina valoarea maxima dintre trei numere a, b si c. Codul utilizeza mai multe decizii
pentru a gasii valoarea maxima . Desi fiecare decizie individuala este unidirectionala ( one-way decision)
codul in ansamblu, utilizeaza mai multe astfel de decizii pentru a rezolva problema, ceea ce creeaza o structura
de tip two-way decision. In acelasi timp, deoarece utilizeaza o clauza "if-else" in interiorul altei clauze
"if-else", putem spune ca avem o structura imbricata ( nested structure).
Nested structure = plasarea unei structuri de control in interiorul altei structuri de control
 */