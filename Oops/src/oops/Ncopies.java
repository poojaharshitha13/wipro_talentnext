package oops;
import java.util.*;
public class Ncopies {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String input = sc.nextLine();
	        int n = input.length();
	        String firstTwo = input.length() >= 2 ? input.substring(0, 2) : input;

	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(firstTwo);
	        }

	        System.out.println("Output: " + result.toString());
	    }
	}
