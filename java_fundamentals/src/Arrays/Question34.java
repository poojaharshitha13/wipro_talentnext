package Arrays;
import java.util.*;
public class Question34 {
	

		public static void main(String[] args) {
			
			
			        Scanner sc = new Scanner(System.in);
			        int[][] arr = new int[3][3];
			        int count = 0;

			        System.out.println("Enter 9 integer numbers:");

			        // Validate and read exactly 9 inputs
			        while (count < 9) {
			            if (sc.hasNextInt()) {
			                arr[count / 3][count % 3] = sc.nextInt();
			                count++;
			            } else {
			                System.out.println("Please enter only integers.");
			                sc.next(); // discard invalid input
			            }
			        }

			        // Print the array
			        System.out.println("The given array is:");
			        for (int i = 0; i < 3; i++) {
			            for (int j = 0; j < 3; j++) {
			                System.out.print(arr[i][j] + " ");
			            }
			            System.out.println();
			        }

			        // Find the biggest number
			        int max = arr[0][0];
			        for (int i = 0; i < 3; i++) {
			            for (int j = 0; j < 3; j++) {
			                if (arr[i][j] > max)
			                    max = arr[i][j];
			            }
			        }

			        System.out.println("The biggest number in the given array is " + max);
			    
}
}
