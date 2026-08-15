package ch1_3.payroll;

public class SalariedEmployee extends Employee {
    private long yearlySalaryCents;

    public SalariedEmployee(String name, long yearlySalaryCents) {
        super(name);
        this.yearlySalaryCents = yearlySalaryCents;
    }

    @Override
    public long monthlyPayCents() {
        return yearlySalaryCents / 12;
    }
}
