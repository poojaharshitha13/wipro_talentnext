package Arrays;
import java.util.*;
public class Question922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
			System.out.println(sum);
			int avg=sum/5;
			 System.out.println(avg);
		}
	
	}

