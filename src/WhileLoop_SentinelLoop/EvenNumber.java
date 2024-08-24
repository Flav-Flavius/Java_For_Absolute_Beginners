package WhileLoop_SentinelLoop;

public class EvenNumber {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) 
        {
            if ( i % 2 == 0) 
            {
                i += 2; // Actualizare cu pas de 2
            }
            System.out.println("Valoarea lui i este:" + i);
        }

        System.out.println("=================");

        i = 0; //Resetarea valorii lui "i" inainte de a doua bucla
        while (i < 10) 
        {
            if (i % 2 == 0) 
            {
                System.out.println("Valoarea lui i este: " + i);
            }
            i++;  
        }
    }

}


/*Diferenta de output intre cele doua bucle este data de plasamentul lui sout. In prima bucla, "sout" este plasat dupa ce valoarea lui "i" a fost
modificata.Acest lucru face ca sa fie afisate doar valorile lui "i" dupa ce au fost incrementate cu "2" . In a doua bucla, "sout" este plasat inainte 
de incrementarea lui "i", ceea ce inseamna ca se afiseaza toate valorile lui "i" care sunt pare inainte de orice modificare.
 * 
 */