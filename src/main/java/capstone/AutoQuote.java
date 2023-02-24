package src.main.java.capstone;

public class AutoQuote extends Quote{
    private final Driver driver;
    private final Vehicle vehicle;
    private final double liabilityLimit;
    private final double deductible;
    private final double basePremium;
    private final double tax;

    public AutoQuote(Driver driver, Vehicle vehicle, double liabilityLimit,
                     double deductible, double totalPremium) {
        super(driver, totalPremium);
        this.driver = driver;
        this.vehicle = vehicle;
        this.liabilityLimit = liabilityLimit;
        this.deductible = deductible;
        this.basePremium = 750;
        this.tax = 1.15;
    }

    @Override
    public Driver getInsuredPerson() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getLiabilityLimit() {
        return liabilityLimit;
    }

    public double getDeductible() {
        return deductible;
    }

    @Override
    public Driver getDriver() {
        return driver;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public double getTax() {
        return tax;
    }
}
