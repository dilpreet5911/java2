public class encapsulation {
    private double balance;

    public encapsulation(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        encapsulation account = new encapsulation(1000.0);
        account.deposit(250.0);
        account.withdraw(150.0);
        System.out.println("Balance: " + account.getBalance());
    }
}
