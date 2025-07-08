package oops;
import java.util.StringJoiner;

public class Merged {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-", "[", "]");
        s1.add("Mumbai").add("Delhi").add("Pune");

        StringJoiner s2 = new StringJoiner("-", "[", "]");
        s2.add("Chennai").add("Bangalore").add("Hyderabad");

        // i) s1 merged into s2
        StringJoiner mergedIntoS2 = new StringJoiner("-", "[", "]");
        mergedIntoS2.merge(s2);
        mergedIntoS2.merge(s1);
        System.out.println("s1 merged into s2: " + mergedIntoS2);

        // ii) s2 merged into s1
        StringJoiner mergedIntoS1 = new StringJoiner("-", "[", "]");
        mergedIntoS1.merge(s1);
        mergedIntoS1.merge(s2);
        System.out.println("s2 merged into s1: " + mergedIntoS1);
    }
}
