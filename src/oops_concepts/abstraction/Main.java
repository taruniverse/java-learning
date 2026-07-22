package oops_concepts.abstraction;

public class Main {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.pay(500);
    }
}

abstract class Payment {
    abstract void pay(int amount);

    void printReceipt() {
        System.out.println("Receipt printed");
    }
}

class UpiPayment extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

