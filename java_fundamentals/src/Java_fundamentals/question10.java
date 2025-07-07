package Java_fundamentals;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = sc.next().charAt(0); // Read first character of user input

        System.out.println("i/p: " + ch);

        if (ch >= 'a' && ch <= 'z') {
            char upper = (char) (ch - 32);
            System.out.println("o/p: " + ch + "->" + upper);
        } else if (ch >= 'A' && ch <= 'Z') {
            char lower = (char) (ch + 32);
            System.out.println("o/p: " + ch + "->" + lower);
        } else {
            System.out.println("Not an alphabet character");
        }

	}

}
