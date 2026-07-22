package design_patterns.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment());
        cart.checkout(500);

        cart.setPaymentStrategy(new UpiPayment());
        cart.checkout(300);
    }
}

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card");
    }
}

class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

