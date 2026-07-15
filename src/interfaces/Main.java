package interfaces;

interface Computer {
    void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code!, Compile!, Enjoy!: From Desktop");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code!, Compile!, Enjoy!: From Laptop");
    }
}

class Developer {
    public void devWebApp(Computer lap) {
        lap.code();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Interface started!");
        Computer lap1 = new Laptop();
        Computer desk1 = new Desktop();
        Developer dev1 = new Developer();
        dev1.devWebApp(lap1);
        dev1.devWebApp(desk1);
        // class extends or create reference because an interface in java is a reference type that acts as a formal contract or blueprint defining a set of behaviors a class must implement
        /**
         * Abstract Methods: Historically, interfaces could only contain abstract methods (methods with signatures but no bodies).
         * Implicit Modifiers: Every method declared in an interface is implicitly public and abstract.
         * Constants: Any variables defined within an interface are implicitly public, static, and final (constants).
         * No Instantiation: Interfaces cannot be used to create objects directly via the new keyword.
         */
    }
}
