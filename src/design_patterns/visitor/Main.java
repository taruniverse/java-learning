package design_patterns.visitor;

public class Main {
    public static void main(String[] args) {
        Item book = new Book(2);
        Item laptop = new Laptop(3);
        ShippingVisitor visitor = new ShippingCostVisitor();

        System.out.println("Book shipping: " + book.accept(visitor));
        System.out.println("Laptop shipping: " + laptop.accept(visitor));
    }
}

interface Item {
    int accept(ShippingVisitor visitor);
}

class Book implements Item {
    private final int weight;

    Book(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return weight;
    }

    public int accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}

class Laptop implements Item {
    private final int weight;

    Laptop(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return weight;
    }

    public int accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}

interface ShippingVisitor {
    int visit(Book book);

    int visit(Laptop laptop);
}

class ShippingCostVisitor implements ShippingVisitor {
    public int visit(Book book) {
        return book.getWeight() * 5;
    }

    public int visit(Laptop laptop) {
        return laptop.getWeight() * 20;
    }
}

