package design_patterns.singleton;

public class LazyInit {
    // sample calculator
    int a;
    int b;

    private static LazyInit obj;

    private LazyInit() {
        System.out.println("Instance Created");
    }

    public int sum() {
        return a + b;
    }

    public static LazyInit getInstance() {
        if (obj == null) {
            obj = new LazyInit();
        }
        return obj;
    }
}
