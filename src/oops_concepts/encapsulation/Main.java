package oops_concepts.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.deposit(-50);

        System.out.println("Balance: " + account.getBalance());
    }
}

class BankAccount {
    private int balance;

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    int getBalance() {
        return balance;
    }
}

