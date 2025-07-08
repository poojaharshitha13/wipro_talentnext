package oops;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Stringjoiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        StringJoiner sj = new StringJoiner(",", "{", "}");
        names.forEach(sj::add);

        System.out.println("Joined names: " + sj.toString());
    }
}
