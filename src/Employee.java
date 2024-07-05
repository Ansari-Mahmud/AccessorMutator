public class Employee {

    private long id;
    private String name;
    private String email;
    private boolean active; // New boolean field

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(long id, String name, String email, boolean active) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active; // Initialize the active field
    }

    // Getter for id
    public long getId() {
        return id;
    }

    // Setter for id
    public void setId(long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for active
    public boolean isActive() {
        return active;
    }

    // Setter for active
    public void setActive(boolean active) {
        this.active = active;
    }

    // Override toString method to include active field
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active + // Include active field in toString
                '}';
    }

}
