package Java_fundamentals;
import java.util.*;
public class question920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to reverse: ");
	        int num = sc.nextInt();
	        int reverse = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num = num / 10;
	        }

	        System.out.println("Reversed number: " + reverse);
	}

}
