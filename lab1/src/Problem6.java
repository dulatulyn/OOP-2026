import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int len = s.length();

        for(int i = 0; i < len / 2; i++){
            if(s.charAt(i) != s.charAt(len - i - 1)){
                System.out.println("Not a palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
    }
}
