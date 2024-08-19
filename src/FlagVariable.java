public class FlagVariable {
    public static void main(String[] args) {
        boolean gasit = false;  // 1
        int[] numere = {1, 2, 3, 4, 5};  // 2
        int cautat = 3;  // 3
        
        for (int i = 0; i < numere.length; i++) // 4
        {
            if (numere[i] == cautat)  // 5
            {
                gasit = true;  // 6
                break; // 7
            }
        }
        if(gasit) // 8
        {
            System.out.println("Numarul a fost gasit"); // 9 
        } else 
        {
            System.out.println("Numarul nu a fost gasit"); //10
        }
    }

}


/* Explicatia detaliata:
1. Initializare variabila booleana "gasit" este initializata cu valoarea "false", presupunand ca, deocamdata, numarul nu a fost gasit.
2. Array-ul "numere" este initializat cu valorile {1, 2, 3, 4, 5}. Acesta este setul de date in care vom cauta numarul "cautat".
3. Initializarea variabilei "cautat " cu valoarea "3".
4. Bucla "for" incepe cu "i = 0", adica incepe de la primul element din array("numere[0]"). Conditia "i < numere.lenght" verifica daca 
"i" este mai mic decat lungimea array-ului astfel incat bucla sa parcurga toate elementele.
5. In interiorul buclei, codul verifica daca elementul curent din array("numere[i]") este egal cu "cautat". La fiecare iteratie, valoarea lui "i"
creste si comparatia se face cu urmatorul element:
   - It 1. "i = 0", "numere[0] = 1", verificare "1 == 3" (fals)
   - It 2. "i = 1", "numere[1] = 2", verificare "2 == 3"(fals)
   - It 3. "i = 2", "numere[2] = 3", verificare "3 == 3"(adevarat)
6. Setare fanion. Cand conditia devine adevarata, variabila "gasit " este setata la "true", indicand ca numarul a fost gasit
7. Dupa ce numarul a fost gasit, instructiunea "break" opreste bucla, deoarece nu mai este necesara cautarea
 * 
 */