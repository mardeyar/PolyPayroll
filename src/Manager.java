public class Manager extends Employee {

    // Attributes for a manager
    private double monthlyBonusAmount;

    // Constructor for a manager
    public Manager(String firstName, String lastName, double monthlyBonusAmount) {
        super(firstName, lastName);
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    // Getter & setter for manager
    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    // Methods for a manager
    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay();
    }
}
