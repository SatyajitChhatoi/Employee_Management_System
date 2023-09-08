import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Create an instance of the employee management system
        EmployeeManagementSystem empManagementSystem = new EmployeeManagementSystem();

        while(true) {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter employee details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(id, name, position, salary);
                    empManagementSystem.addEmployee(employee);
                    break;
                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    empManagementSystem.removeEmployee(removeId);
                    break;
                case 3:
                    empManagementSystem.displayAllEmployees();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        //Add employees to the system
        // empManagementSystem.addEmployee(new Employee(1, "Rajesh Mohanty", "Manager", 5000));
        // empManagementSystem.addEmployee(new Employee(2, "Rahul Ray","Developer", 3000));
        // empManagementSystem.addEmployee(new Employee(3, "Ravi Sahoo", "Tester", 2500));
    
        // Display all employees
        // empManagementSystem.displayAllEmployees();
    
        // Update salary for an employee
        // empManagementSystem.updateSalary(2, 3500);
    
        // Display all employees after salary update
        // empManagementSystem.displayAllEmployees();
    
        // Remove an employee
        // empManagementSystem.removeEmployee(1);
    
        // Display all employees after removal
        // empManagementSystem.displayAllEmployees();
    }
}


    

