package oops;
import java.util.Scanner;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();

        if (n < 0 || n > input.length()) {
            System.out.println("Invalid input: n must be between 0 and string length.");
            return;
        }

        String part = input.substring(input.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(part);
        }

        System.out.println("Output: " + result.toString());
    }
}
