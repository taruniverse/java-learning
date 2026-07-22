package oops_concepts.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

