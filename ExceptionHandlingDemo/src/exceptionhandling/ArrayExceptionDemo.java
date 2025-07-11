package exceptionhandling;

import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;

        try {
            System.out.print("Enter the number of elements in the array: ");
            int size = Integer.parseInt(scanner.nextLine());
            arr = new int[size];

            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(scanner.nextLine());
            }

            System.out.print("Enter the index of the array element you want to access: ");
            int index = Integer.parseInt(scanner.nextLine());

            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Invalid input. Please enter an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException: Index is out of range.");
        } catch (Exception e) {
            System.out.println("Some unexpected error occurred: " + e);
        } finally {
            scanner.close();
        }
    }
}
