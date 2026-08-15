package ch1_3.payroll;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract long monthlyPayCents();

    public static String formatMoney(long totalCents) {
        long dollars = totalCents / 100;
        long cents = totalCents % 100;

        return "$" + String.format("%,d", dollars) + "." + String.format("%02d", cents);
    }

    @Override
    public String toString() {
        return String.format("%-20s", getName()) + formatMoney(monthlyPayCents());
    }
}
