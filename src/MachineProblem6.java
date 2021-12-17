import java.text.DecimalFormat;
import java.util.Scanner;

public class MachineProblem6 {

    public static void main(String[] args) {

        Circle existingCylinder = new Cylinder( 5, 10 );

        Circle potentiallyNewCylinder = getNewCylinder();

        while( existingCylinder.equals(potentiallyNewCylinder) ) {
            System.out.println("The two cylinders are equal. Please enter another one.\n");
            potentiallyNewCylinder = getNewCylinder();
        }

        System.out.println("Cylinder 1 (existing): " + existingCylinder);
        System.out.println("Cylinder 2 (new): " + potentiallyNewCylinder);
    }

    public static Circle getNewCylinder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height of a circle: ");
        double height = sc.nextDouble();

        return new Cylinder(radius, height);
    }
}
