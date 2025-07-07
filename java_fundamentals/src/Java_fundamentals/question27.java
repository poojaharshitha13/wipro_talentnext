package Java_fundamentals;
import java.util.*;
public class question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		Set<Integer> obj=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			obj.add(arr[i]);
		}
		for(int num : obj)
		{
			System.out.println(num);
		}
	}

}
