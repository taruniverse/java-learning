package java_basics.enum_keyword;

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;
        System.out.println("Order status: " + status);
    }
}

enum OrderStatus {
    PLACED,
    SHIPPED,
    DELIVERED
}

