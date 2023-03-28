public class PieceWorker extends Employee {

    // Attributes for a pieceworker employee
    private int unitsProduced;

    // Constructor for pieceworker
    public PieceWorker(String firstName, String lastName, int unitsProduced) {
        super(firstName, lastName);
        this.unitsProduced = unitsProduced;
    }

    // Getter & setter for pieceworker
    public int getUnitsProduced() {
        return unitsProduced;
    }

    public void setUnitsProduced(int unitsProduced) {
        this.unitsProduced = unitsProduced;
    }

    // Methods for a pieceworker
    @Override
    public double calculateMonthlyPay() {
        return unitsProduced;
    }
}
