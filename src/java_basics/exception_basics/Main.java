package java_basics.exception_basics;

public class Main {
    public static void main(String[] args) {
        try {
            int answer = divide(10, 0);
            System.out.println(answer);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block runs");
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Zero is not allowed");
        }
        return a / b;
    }
}

