package com.exceptionhandling.marks;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter marks for Student " + i + " (3 subjects):");

                int[] marks = new int[3];
                int total = 0;

                for (int j = 0; j < 3; j++) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    String input = sc.next();

                    // Check for number format
                    int mark = Integer.parseInt(input);

                    // Custom exception checks
                    if (mark < 0) {
                        throw new NegativeMarksException("Marks cannot be negative");
                    }
                    if (mark > 100) {
                        throw new MarksOutOfRangeException("Marks cannot be more than 100");
                    }

                    marks[j] = mark;
                    total += mark;
                }

                double average = total / 3.0;
                System.out.println("Average marks for Student " + i + ": " + average);
                System.out.println("-----------------------------------");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter only integers.");
        } catch (NegativeMarksException | MarksOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
