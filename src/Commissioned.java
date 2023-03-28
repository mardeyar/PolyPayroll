public class Commissioned extends Employee {

    // Attributes specifically for a commissioned employee
    private double grossSales;

    // Constructor for commissioned employee
    public Commissioned(String firstName, String lastName, double grossSales) {
        super(firstName, lastName);
        this.grossSales = grossSales;
    }

    // Getter & setter for commissioned employee
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    // Methods for a commissioned employee
    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay();
    }
}
