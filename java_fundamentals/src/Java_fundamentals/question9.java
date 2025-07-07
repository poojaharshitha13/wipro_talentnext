package Java_fundamentals;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter gender (Male/Female): ");
	        String gender = scanner.next();

	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();

	        if (gender.equalsIgnoreCase("Female")) {
	            if (age >= 1 && age <= 58) {
	                System.out.println("Interest: 8.2%");
	            } else if (age >= 59 && age <= 100) {
	                System.out.println("Interest: 9.2%");
	            } else {
	                System.out.println("Invalid age range");
	            }
	        } else if (gender.equalsIgnoreCase("Male")) {
	            if (age >= 1 && age <= 58) {
	                System.out.println("Interest: 8.4%");
	            } else if (age >= 59 && age <= 100) {
	                System.out.println("Interest: 10.5%");
	            } else {
	                System.out.println("Invalid age range");
	            }
	        } else {
	            System.out.println("Invalid gender");
	        }

	}

}
