package Java_fundamentals;
import java.util.*;
public class question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[5];
		arr[0]=2;
		arr[1]=5;
		arr[ 2]=8;
		arr[3]=7;
		arr[4]=10;
		boolean sum=false;
		for(int i=0;i<5;i++)
		{
			if(arr[i]==n)
			{
				System.out.println(i);
				sum=true;
				break;
			}
		}
		if(sum==false) {
			System.out.print("-1");
		}
	}

}



