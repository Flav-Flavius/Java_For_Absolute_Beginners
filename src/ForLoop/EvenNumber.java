package ForLoop;

public class EvenNumber {
    public static void main(String[] args) {

        // Bucla for combinata cu instructiune if ce utilizezza operatorul modulo
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("=====================");

        // Bucla for cu initializare multipla, unde a este variabila de control (contor) si e este variabila de calcul
        for ( int a = 0, e = 0; a < 10; a++) {
            e = a * 2;
            System.out.println(e);
        }

        System.out.println("===========================");

        // Bucla for cu pas de 2
        for (int i = 0; i <= 20; i += 2)
            System.out.println(i);

        System.out.println("=======================");

        //Bucla for fara conditie de terminare
        for (int i = 0;; i += 2) {
            if (i > 20)
                break;
            System.out.println(i);
        }
    }
}
