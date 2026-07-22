package design_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        UiFactory factory = new DarkThemeFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}

interface Button {
    void render();
}

interface Checkbox {
    void render();
}

interface UiFactory {
    Button createButton();

    Checkbox createCheckbox();
}

class LightThemeFactory implements UiFactory {
    public Button createButton() {
        return () -> System.out.println("Light button");
    }

    public Checkbox createCheckbox() {
        return () -> System.out.println("Light checkbox");
    }
}

class DarkThemeFactory implements UiFactory {
    public Button createButton() {
        return () -> System.out.println("Dark button");
    }

    public Checkbox createCheckbox() {
        return () -> System.out.println("Dark checkbox");
    }
}

