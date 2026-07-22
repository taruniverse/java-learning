package java_basics.access_modifiers;

public class Main {
    public static void main(String[] args) {
        User user = new User("Tarun");
        user.sayHello();
        System.out.println(user.getName());
    }
}

class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from public method");
    }

    public String getName() {
        return name;
    }
}

