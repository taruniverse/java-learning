package design_patterns.singleton;

public class Calculator {
    int a;
    int b;

    private static Calculator obj = new Calculator(2, 2);

    private Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public static Calculator getInstance() {
        return obj;
    }
}
