package com.wipro.employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Harshitha", "harshitha@example.com", "Female", 60000f);
        Employee e2 = new Employee(102, "Rahul", "rahul@example.com", "Male", 55000f);

        EmployeeDB db = new EmployeeDB();
        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("\n--- Employee Details ---");
        e1.getEmployeeDetails();
        e2.getEmployeeDetails();

        System.out.println("\n--- Pay Slip ---");
        System.out.println(db.showPaySlip(101));
        System.out.println(db.showPaySlip(105)); // not existing

        System.out.println("\n--- Deleting Employee with ID 102 ---");
        if (db.deleteEmployee(102)) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\n--- Employee Pay Slips after Deletion ---");
        System.out.println(db.showPaySlip(102));
    }
}
