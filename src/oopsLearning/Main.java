package oopsLearning;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Tarun", 24); // if we need to pass as prop in class we need to use constructor

        /** with this we can override the actual things until its not private
         * s1.name = "Tarun Gupta";
         *  s1.age = 24;
         */
        s1.study();
        s1.setStudentSaving(2400);
        System.out.println(s1.getStudentSaving());
        System.out.println("Student One " + s1 + "Student Name " + s1.name);


        // Inheritance starts
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        // Inheritance ends

        // polymorphism - one interface, different behavior
        Dog d2 = new Dog();
        d2.sound();
        // polymorphism end

        // Abstraction - hide implementation details and expose only what's necessary;
        Car c1 = new Car();
        c1.start();

    }
}
