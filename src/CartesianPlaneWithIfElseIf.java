/* This program takes a point (x,y) from the user and find the quadrant where the
point lies on a Cartesian plane
 */

import java.util.Scanner;

public class CartesianPlaneWithIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coordinates of the point
        System.out.print("Enter the x coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y coordinate: ");
        double y = scanner.nextDouble();

        // Determine in which quadrant the point lies
        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant IV.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        } else if (x == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the X-axis.");
        }

        scanner.close();
    }
}


/* Acest program initializeaza un obiect 'Scanner' pentru a prelua intrarile de la utilizator
si utilizeza o structura de tip "if-else if" pentru a determina in ce cadran se afla punctul
 */

