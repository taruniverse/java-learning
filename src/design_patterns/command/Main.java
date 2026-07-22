package design_patterns.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnLightCommand(light);
        Button button = new Button(turnOn);

        button.press();
    }
}

interface Command {
    void execute();
}

class Light {
    void on() {
        System.out.println("Light is on");
    }
}

class TurnOnLightCommand implements Command {
    private final Light light;

    TurnOnLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

class Button {
    private final Command command;

    Button(Command command) {
        this.command = command;
    }

    void press() {
        command.execute();
    }
}

