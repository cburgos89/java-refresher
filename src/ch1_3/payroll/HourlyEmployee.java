package ch1_3.payroll;

public class HourlyEmployee extends Employee {
    private long hourlyRateCents;
    private int hoursPerMonth;

    public HourlyEmployee(String name, long hourlyRate, int hoursPerMonth) {
        super(name);
        this.hourlyRateCents = hourlyRate;
        this.hoursPerMonth = hoursPerMonth;
    }

    @Override
    public long monthlyPayCents() {
        return hourlyRateCents * hoursPerMonth;
    }
}
