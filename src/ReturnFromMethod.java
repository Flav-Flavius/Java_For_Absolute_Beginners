public class ReturnFromMethod {

    // Metodă care verifică dacă un număr este par
    public static boolean estePar(int numar) {
        return numar % 2 == 0;   // Utilizarea cuvantului cheie "return"
    }

    public static void main(String[] args) {
        int a = 7;  // Sau orice număr întreg

        // Folosim metoda estePar pentru a verifica paritatea lui a
        if (estePar(a)) {
            System.out.println("Numarul este par.");
        } else {
            System.out.println("Numarul este impar.");
        }
    }
}

