package oops_concepts.overloading_overriding;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));

        Vehicle vehicle = new Bike();
        vehicle.start();
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a self button");
    }
}

