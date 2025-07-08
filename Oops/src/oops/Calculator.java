package oops;

public class Calculator {
	static int powerInt(int n1,int n2) {
		return (int)Math.pow(n1,n2);
	}
	static double powerDouble(double n1,double n2) {
		return Math.pow(n1,n2);
	}
	public static void main(String args[]) {
		System.out.println(powerInt(2, 3));
		System.out.println(powerDouble(2.5, 3.6));
	}
}
