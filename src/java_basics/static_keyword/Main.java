package java_basics.static_keyword;

public class Main {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Objects created: " + Counter.count);
        Counter.showMessage();
    }
}

class Counter {
    static int count;

    Counter() {
        count++;
    }

    static void showMessage() {
        System.out.println("Static method called");
    }
}

