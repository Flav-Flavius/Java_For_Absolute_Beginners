import java.util.Scanner;
public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea valorilor a si b
        System.out.println("Introduceti valoarea pentru a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti valoarea pentru b: ");
        int b = scanner.nextInt();

        // Calcularea diferentei
        int diff = a - b;

        // Verificare daca diferenta este negativa
        if (diff < 0) {
            // True Branch: Transformarea diferentei in valoarea sa absoluta
            diff = -diff;
        }

        System.out.println("Diferenta absoluta este: " + diff);
        scanner.close();
    }
}


/* Valoarea absoluta a unui numar este distanta acelui numar fata de zero pe axa numerelor reale,
fara a tine cont de semn. Diferenta absoluta dintre doua numere a si b este valoarea absoluta a
diferentei lor. In codul de mai sus se calculeaza diferenta dintre a si b, iar daca rezultatul este negativ,
codul il transforma in pozitiv prin diff = -diff
Presupunand ca diff = -7, atunci prin expresia de mai sus devine -(-7) adica 7
 */