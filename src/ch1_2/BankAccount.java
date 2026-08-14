package ch1_2;

public class BankAccount {
    String owner;
    Long balanceCents;
    static int accountsOpened = 0;

    BankAccount(String owner, Long balanceCents) {
        this.owner = owner;
        this.balanceCents = balanceCents;
        accountsOpened = accountsOpened + 1;
    }

    Long deposit(Long dep) {
        System.out.println(owner + " wants to deposit " + convertCentstoDollars(dep) + " to current balance of " + convertCentstoDollars(balanceCents));
        balanceCents = balanceCents + dep;
        System.out.println("New balance: " + convertCentstoDollars(balanceCents));
        return balanceCents;
    }

    Long withdraw(Long with) {
        System.out.println(owner + " wants to withdraw " + convertCentstoDollars(with) + " from current balance of " + convertCentstoDollars(balanceCents));
        balanceCents = balanceCents - with;
        System.out.println("New balance: " + convertCentstoDollars(balanceCents));
        return balanceCents;
    }

    String convertCentstoDollars(Long money) {
        Long dollars = money / 100;
        Long cents = money % 100;

        if (cents == 0) {
            return "$" + dollars + "." + cents + "0";
        }
        else {
            return "$" + dollars + "." + cents;
        }
    }

    String statement() {
        return "=== " + owner + " summary ===\n" +
                "Balance: " + convertCentstoDollars(balanceCents) + "\n" +
                "Accounts opened: " + accountsOpened + "\n\n";
    }
}
