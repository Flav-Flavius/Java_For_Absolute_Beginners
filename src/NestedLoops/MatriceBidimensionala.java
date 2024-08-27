package NestedLoops;

public class MatriceBidimensionala {
    public static void main(String[] args) {
        // Definim o matrice bidimensionala
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Obtinem numarul de randuri si coloane
        int numarRanduri = matrice.length;
        int numarColoane = matrice[0].length;

        // Parcurgerea matricei utilizand cicluri imbricate
        for (int i = 0; i < numarRanduri; i++) // ciclu exterior
        {
            for (int j = 0; j < numarColoane; j++) // ciclu interior
            {
                System.out.print(matrice[i][j]);
                // Adaugarea unui spatiu intre elementele din rand
                if (j < matrice[i].length - 1) {
                    System.out.print(" ");
                }
            }
            // Trecerea la urmatorul rand
            System.out.println();
        }
    }

}

/* Parcurgerea matricei utilizand nested loop explicata:
   - Ciclul exterior itereza prin fiecare rand al matricei. 'i' incepe de la 0 si se incrementeaza pana la 'numarRanduri - 1'
   - Ciclul interior parcurge fiecare element dintr-un rand(coloanele). Pentru fiecare iteratie a ciclului exterior, ciclul interior parcurge complet toate coloanele randului curent.
1. Prima iteratie a ciclului exterior (i = 0):
Se proceseaza primul rand '{1, 2, 3}'
Ciclul interior('j = 0'):
   - Se afiseaza '1'
   - Se adauga un spatiu
Ciclul interior('j = 1'):
   - Se affiseaza '2'
   - Se adauga un spatiu
Ciclul interior ('j = 2'):
   - Se afiseaza '3'
   - Nu se adauga spatiu deoarece 'j = 2' este ultima coloana
'System.out.println()' este apelat dupa inchiderea ciclului interior, iar cursorul trece la linia urmatoare
2. A doua si a treia iteratie se realizeaza in mod similar

Ciclul exterior executa 3 iteratii(pentru fiecare rand al matricei)
Ciclul interior executa 9 iteratii(3 iteratii pentru fiecare rand, de trei ori pentru fiecare rand)
 * 
 */
