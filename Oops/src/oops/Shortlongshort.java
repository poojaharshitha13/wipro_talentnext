package oops;
import java.util.*;

public class Shortlongshort {
    public static void main(String[] args) {
        String res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        if (a.length() > b.length()) {
            res = b + a + b;
        } else {
            res = a + b + a;
        }
       System.out.println("Output: " + res);
    }
}

