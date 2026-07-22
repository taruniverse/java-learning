package design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println(coffee.getDescription());
        System.out.println("Cost: " + coffee.getCost());
    }
}

interface Coffee {
    String getDescription();

    int getCost();
}

class PlainCoffee implements Coffee {
    public String getDescription() {
        return "Plain coffee";
    }

    public int getCost() {
        return 20;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected final Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }

    public int getCost() {
        return coffee.getCost() + 10;
    }
}

class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", sugar";
    }

    public int getCost() {
        return coffee.getCost() + 5;
    }
}

