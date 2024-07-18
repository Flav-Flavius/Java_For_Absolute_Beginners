public class ReturnAsResult {
    public static void main(String[] args) {
        int a = 7;  // Sau orice număr întreg

        // Verificăm dacă a este par sau impar folosind operatorul %
        // a % 2 "returnează" 0 dacă a este par și 1 dacă a este impar
        if (a % 2 == 0) {
            // Dacă a % 2 == 0 este adevărat, a este par
            System.out.println("Numarul este par.");
        } else {
            // Dacă a % 2 == 0 este fals, a este impar
            System.out.println("Numarul este impar.");
        }
    }
}
