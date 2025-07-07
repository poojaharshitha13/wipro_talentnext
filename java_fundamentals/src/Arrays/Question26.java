package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int max1=arr[n-2];
		int max2=arr[n-1];
		int min1=arr[0];
		int min2=arr[1];
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(min1);
		System.out.println(min2);
	}
	

}