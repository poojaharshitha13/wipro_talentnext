package lambdaexp;

public class Main {
    public static void main(String[] args) {
        // Lambda expression to add three numbers
        Test t1 = (a, b, c) -> a + b + c;

        // Lambda expression to multiply three numbers
        Test t2 = (a, b, c) -> a * b * c;

        // Call the methods
        int sum = t1.myFunction(2, 3, 4);     // 2 + 3 + 4 = 9
        int product = t2.myFunction(2, 3, 4); // 2 * 3 * 4 = 24

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
