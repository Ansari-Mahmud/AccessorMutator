public class Main {

    public static void main(String[] args) {
        // Create an employee using the default constructor and set values using setters
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("John Doe");
        employee1.setEmail("john.doe@example.com");
        employee1.setActive(true);

        // Create an employee using the parameterized constructor
        Employee employee2 = new Employee(2, "Jane Smith", "jane.smith@example.com", false);

        // Print out the employee details using the toString method
        System.out.println(employee1);
        System.out.println(employee2);

        // Change the status of the second employee and print again
        employee2.setActive(true);
        System.out.println("After updating active status:");
        System.out.println(employee2);
    }
}
