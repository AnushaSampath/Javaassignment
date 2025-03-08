import java.util.*;

// Employee class with attributes and method
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Anusha", 50000);
        Employee emp2 = new Employee(102, "sharath", 60000);
        Employee emp3 = new Employee(103, "Chandan", 55000);

        // Storing them in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying their details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
