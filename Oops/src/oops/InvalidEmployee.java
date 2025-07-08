package oops;

import java.util.Optional;


class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

public class InvalidEmployee {
    public static void main(String[] args) {
        Employee emp = null; 

        Employee validEmp = Optional.ofNullable(emp)
                .orElseThrow(() -> new InvalidEmployeeException("Employee is null"));

        System.out.println("Employee is valid: " + validEmp.name);
    }
}
