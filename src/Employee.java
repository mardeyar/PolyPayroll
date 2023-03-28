public abstract class Employee {

    // Attributes for all employees
    private String firstName;
    private String lastName;

    // Constructor for employee
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters & setters for employee attributes
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Methods for all employees
    public double calculateMonthlyPay() {
        return 0.0;
    }
}
