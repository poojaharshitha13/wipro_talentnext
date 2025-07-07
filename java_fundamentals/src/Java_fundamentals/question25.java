package Java_fundamentals;
import java.util.*;
public class question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
