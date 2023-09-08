import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters  an setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString() method to display employee information
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
    }
}

class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    // Add a new employee to the system
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Remove an employee from the system
    public void removeEmployee(int employeeId) {
        Employee employee = findEmployeeByID(employeeId);
        if(employee != null) {
            employees.remove(employee);
            System.out.println("Employee with ID " + employeeId + " has been removed.");
        } else {
            System.out.println("Employee with ID "+ employeeId + " not found.");
        }
    }

    // Update the salary of an employee
    public void updateSalary(int employeeId, double newSalary) {
        Employee employee = findEmployeeByID(employeeId);
        if(employee != null) {
            employee.setSalary(newSalary);
            System.out.println("Salary updated for employee with ID "+ employeeId);
        } else {
           System.out.println("Employee with  ID "+ employeeId +" not found."); 
        }
    }

    // Retrieve an employee by ID
    public Employee findEmployeeByID(int employeeId) {
        for(Employee employee : employees) {
            if(employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    // Display all employees in the system
    public void displayAllEmployees() {
        System.out.println("Employee List:");
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

