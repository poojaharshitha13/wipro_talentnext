package Java_fundamentals;
import java.util.*;
public class question919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 1) {
            System.out.println("Please enter an integer number");
            return;
        }

        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer number");
            return;
        }

        int i = 1;
        int count = 1;

        while (i <= n) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                count++;
            }
            System.out.println();
            i++;
        }
	}

}
