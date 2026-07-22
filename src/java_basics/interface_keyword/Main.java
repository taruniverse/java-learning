package java_basics.interface_keyword;

public class Main {
    public static void main(String[] args) {
        Printer printer = new InkPrinter();
        printer.print("Learning interface");
    }
}

interface Printer {
    void print(String text);
}

class InkPrinter implements Printer {
    public void print(String text) {
        System.out.println("Printing: " + text);
    }
}

