package oopsLearning;

public class Car extends Vehicle {
    @Override
    void start() {
        // in this user only knows they can call start(), not how it's implemented
        System.out.println("Vehicle extended with car and overrided it and say's - " + "Car starts with the key");
    }
}
