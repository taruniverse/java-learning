package oops_concepts.this_super;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ravi", "Developer");
        employee.show();
    }
}

class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private final String role;

    Employee(String name, String role) {
        super(name);
        this.role = role;
    }

    void show() {
        System.out.println(name + " works as " + role);
    }
}

