// A program that displays all posible pairs ( the Cartesian product) between the elements of two given sets A and B.
// A = {-1, -2, -3} and B = {1, 2, 3}

package NestedLoops;

public class CartesianProduct {
    public static void main(String[] args) {
        for (int e = -1; e >= -3; e--) // outer loop
        {
            for (int m = 1; m <= 3; m++) // inner loop
            {
                System.out.print("(" + e + ", " + m + ") ") ;
            }           
        }
        // Dupa ce au fost afisate toate perechile, cursorul este inca pe aceeasi linie. De aceea am utilizat inca un "System.out.println();" abia apoi se afiseaza pe alta linie "======="
        System.out.println();
        System.out.println("=======================");

        for (int e = -1; e >= -3; e--) // outer loop
        {
            for (int m = 1; m <= 3; m++) //inner loop
            {
                System.out.print(e + " " + m + "\t");  // Folosim "\t" pentru a include mai multe spatii 
            }
        }
        System.out.println();
        System.out.println("===================");


        /* A real-world example where you might use a nested for loop similar to one used to generate a Cartesian product is generating combinations of colors and sizes for a product in an online store. Suppose you have a store that sells t-shirts, and you want to generate a list of all possible combinations of available colors and sizes. */
         
        // Lista de culori disponibile
         String[] colors = {"Red", "Blue", "Green"};
        
         // Lista de dimensiuni disponibile
         String[] sizes = {"Small", "Medium", "Large"};

        for (int i = 0; i < colors.length; i++) 
        {  // Bucla exterioara pentru culori
            for (int j = 0; j < sizes.length; j++) 
            {  // Bucla interioara pentru dimensiuni
                System.out.println("Color: " + colors[i] + ", Size: " + sizes[j]);
            }
        }
    }
}
