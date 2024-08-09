// A program that shows the terms of the geometric sequence 1, 3, 9...... that stops before the 
// value exceeds 1000

package WhileLoop_SentinelLoop;

public class GeometricSequence {
    public static void main(String[] args) {
        int num = 1;
        while (num < 1000) 
        {
            System.out.println(num);
            num *= 3;
        }
    }

}


/* Geometric sequence (Progresia geometrica) este un sir de numere in care fiecare termen dupa
 primul este obtinut prin inmultirea termenului precedent cu un numar constant, numit ratia progresiei
 sau numitor comun sau factor de multiplicare.
 Pentru a afla numitorul comun al unui sir trebuie sa calculam raportul dintre doi termeni consecutivi ai sirului.
 */