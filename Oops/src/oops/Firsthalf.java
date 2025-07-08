package oops;
import java.util.*;
public class Firsthalf {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String string=sc.nextLine();
	int a=string.length();
	if(a%2==0)
	{
		System.out.println(string);
	}
	else
	{
		System.out.println("null");
	}
}
}
