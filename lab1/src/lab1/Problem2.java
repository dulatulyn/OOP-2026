import java.util.Scanner;
import java.lang.Math;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the edge of square: ");
        int edge = scanner.nextInt();

        System.out.println("Area of square: " + (int) Math.pow(edge, 2)); // we also could go by multiplying edge by itself
        System.out.println("Perimtere of square: " + 4 * edge);
        System.out.println("Diagonal of square: " + edge * Math.sqrt(2));
    }
}
