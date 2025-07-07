package Arrays;
import java.util.*;
public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
					Scanner sc=new Scanner(System.in);
					int arr[][]=new int[2][2];
					for(int i=0;i<arr.length;i++) {
						for(int j=0;j<arr.length;j++) {
						arr[i][j]=sc.nextInt();
					}
					}
					System.out.println("The given array is");
					for(int i=0;i<2;i++) {
						for(int j=0;j<2;j++) {
						System.out.print(arr[i][j]+" ");
					}
						System.out.println();
				}
					System.out.println("Reversed Array");
					for(int i=arr.length-1;i>=0;i--) {
						for(int j=arr.length-1;j>=0;j--) {
							System.out.print(arr[i][j]+" ");
						}
						System.out.println();
					}
				
	}

}
