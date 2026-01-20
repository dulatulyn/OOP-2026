import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sum: ");
        int sum = scanner.nextInt();

        System.out.println("Enter the interest rate (%): ");
        int interest = scanner.nextInt();

        System.out.println(sum + sum * interest / 100);
    }
}
