package ch1_2;

public class Bank {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Corey", 2400L);
        System.out.println(bankAccount1.statement());

        BankAccount bankAccount2 = new BankAccount("Chitra", 500034L);
        System.out.println(bankAccount2.statement());

        bankAccount1.deposit(600L);
        bankAccount2.withdraw(200L);

        System.out.println(bankAccount1.statement());
        System.out.println(bankAccount2.statement());

        bankAccount1.withdraw(1000L);
        bankAccount2.deposit(6000L);

        System.out.println(bankAccount1.statement());
        System.out.println(bankAccount2.statement());
    }
}
