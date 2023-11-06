import java.util.Scanner;

public class EXP2_Quadratic_Equation {  // Change to Solution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE COEFFICIENTS OF QUADRATIC EQUATION ax^2 + bx + c:");
        System.out.println("a");
        double a = sc.nextDouble();
        System.out.println("b");
        double b = sc.nextDouble();
        System.out.println("c");
        double c = sc.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        System.out.println("DISCRIMINANT = " + discriminant);
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("THE TWO ROOTS ARE REAL AND HAVE DISTINCT SOLUTIONS");
            System.out.println("root 1 = " + root1);
            System.out.println("root 2 = " + root2);
        } else if (discriminant == 0) {
            double r = -b / (2 * a);
            System.out.println("r = " + r);
            System.out.println("BOTH ROOTS ARE EQUAL");
        } else {
            System.out.println("NO REAL SOLUTIONS");
        }
    }
}
