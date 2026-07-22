package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        // In Java, a Singleton class is a design pattern that guarantees a class has exactly one instance per Java Virtual Machine (JVM) and provides a global point of access to that instance
        Calculator c1 = Calculator.getInstance();
        Calculator c2 = Calculator.getInstance();
        System.out.println(c1.sum());
        System.out.println(c2.sum());

        // Lazy initialization
        LazyInit l1 = LazyInit.getInstance();
        LazyInit l2 = LazyInit.getInstance();
        l1.a = 2;
        l1.b = 4;
        l2.a = 2;
        l2.b = 5;
        System.out.println(l1.sum());
        System.out.println(l2.sum());
    }
}
