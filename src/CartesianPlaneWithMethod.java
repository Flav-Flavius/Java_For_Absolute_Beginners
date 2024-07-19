/* This program takes a point (x,y) from the user and find the quadrant where the
point lies on a Cartesian plane
 */

import java.util.Scanner;

public class CartesianPlaneWithMethod {

    public static String determineQuadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return "Quadrant I";
        } else if (x < 0 && y > 0) {
            return "Quadrant II";
        } else if (x < 0 && y < 0) {
            return "Quadrant III";
        } else if (x > 0 && y < 0) {
            return "Quadrant IV";
        } else if (x == 0 && y == 0) {
            return "Origin";
        } else if (x == 0) {
            return "Y-axis";
        } else {
            return "X-axis";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y coordinate: ");
        double y = scanner.nextDouble();

        String quadrant = determineQuadrant(x, y);
        System.out.println("The point (" + x + ", " + y + ") lies in " + quadrant + ".");

        scanner.close();
    }
}


/* In acest program am declarat o metoda "determineQuadrant" ca 'public static', ceea ce
inseamna ca poate fi apelata fara a crea o instanta a clasei "CartesianPlaneWithMethod"
Metoda primeste doua argumente de tip double 'x' si 'y' care reprezinta coordonatele
punctului. Metoda returneaza un 'String' care indica cadranul in care se afla punctul
 */