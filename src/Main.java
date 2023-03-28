import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Decimal format to get $ format
        DecimalFormat df2 = new DecimalFormat("00.00");

        // Create an arraylist to store all employees
        ArrayList<Employee> empList = new ArrayList<>();

        // Add some employees to empList, hard coding for simplicity
        empList.add(new Commissioned("Bob", "Loblaw", 40000));
        empList.add(new Salaried("Sue", "Me", 10));
        empList.add(new PieceWorker("Tina", "Zena", 1000));
        empList.add(new Manager("Richard", "Rich", 2000));

        // For each loop to go through and grab info
        for (Employee current : empList) {
            String empName = current.getFirstName() + " " + current.getLastName();
            String empType;
            // Run some if logic to get empName and empType
            if (current instanceof Commissioned) {
                empType = "Commissioned";
            } else if (current instanceof Salaried) {
                empType = "Salaried";
            } else if (current instanceof PieceWorker) {
                empType = "PieceWorker";
            } else if (current instanceof Manager) {
                empType = "Manager";
            } else {
                empType = "TypeUnknown";
            }
            double empPay = current.calculateMonthlyPay();
            // Lastly, print the info from above
            System.out.println("\nName: " + empName + "\nPay Type: " + empType + "\nMonthly Pay: $" + df2.format(empPay));
        }
    }
}