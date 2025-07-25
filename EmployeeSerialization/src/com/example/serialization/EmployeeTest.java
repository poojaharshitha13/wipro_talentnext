package com.example.serialization;

import java.io.*;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
       
        Employee emp = new Employee("Harshitha", new Date(), "IT", "Software Engineer", 55000.0);

       
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(emp);
            System.out.println("✅ Object serialized to file 'data'");
        } catch (IOException e) {
            System.out.println("❌ Serialization failed: " + e.getMessage());
        }

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("\n✅ Object deserialized from file 'data':");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Deserialization failed: " + e.getMessage());
        }
    }
}
