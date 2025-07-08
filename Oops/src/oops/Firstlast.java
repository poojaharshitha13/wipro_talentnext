package oops;
import java.util.*;
 class Firstlast{
        public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String st=sc.nextLine();
        String res=st.substring(1,st.length()-1);
		System.out.println("o/p: " + res);
        }

}