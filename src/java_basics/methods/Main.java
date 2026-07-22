package java_basics.methods;

public class Main {
    public static void main(String[] args) {
        greet("Tarun");
        int answer = sum(10, 20);
        System.out.println("Sum: " + answer);
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

