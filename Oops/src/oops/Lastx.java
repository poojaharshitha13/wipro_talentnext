package oops;
import java.util.*;
public class Lastx {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter string: ");
		        String input = sc.nextLine();

		        if (input.startsWith("x")) {
		            input = input.substring(1);
		        }

		        if (input.endsWith("x")) {
		            input = input.substring(0, input.length() - 1);
		        }

		        System.out.println("Output: " + input);
		    }
		


	}


