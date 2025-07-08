package oops;
import java.util.Scanner;
public class Combinations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLen; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
