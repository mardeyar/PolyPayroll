public class Salaried extends Employee {

    // Attributes for salaried employee
    private int yearsOfService;

    // Constructor for a salaried
    public Salaried(String firstName, String lastName, int yearsOfService) {
        super(firstName, lastName);
        this.yearsOfService = yearsOfService;
    }

    // Getter & setter for salaried employee
    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Methods for salaried employee

    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay();
    }
}
