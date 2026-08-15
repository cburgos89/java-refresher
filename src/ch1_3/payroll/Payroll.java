package ch1_3.payroll;

public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Ana Torres", 6_250_000L),
                new HourlyEmployee("Luis Vega", 1_950L, 160),
                new HourlyEmployee("Corey Burgos", 3_023, 160)
        };

        long totalCents = 0;

        for (Employee e : employees) {
            totalCents += e.monthlyPayCents();
            System.out.println(e);
        }

        System.out.println(String.format("%-20s", "TOTAL") + Employee.formatMoney(totalCents));
    }
}
