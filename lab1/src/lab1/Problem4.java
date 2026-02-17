import java.util.Scanner;
import java.lang.Math;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quadratic equation (e.g. [a] x^2 + [b] x + [c])");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double D = Math.pow(b, 2) - 4 * a * c;

        if(D < 0) System.out.println("No real roots");
        else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are: " + x1 + " and " + x2);
        }
    }
}
