package design_patterns.state;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.show();
        light.next();
        light.show();
        light.next();
        light.show();
    }
}

interface LightState {
    void show();

    LightState next();
}

class RedState implements LightState {
    public void show() {
        System.out.println("Red: stop");
    }

    public LightState next() {
        return new GreenState();
    }
}

class GreenState implements LightState {
    public void show() {
        System.out.println("Green: go");
    }

    public LightState next() {
        return new YellowState();
    }
}

class YellowState implements LightState {
    public void show() {
        System.out.println("Yellow: slow down");
    }

    public LightState next() {
        return new RedState();
    }
}

class TrafficLight {
    private LightState state = new RedState();

    void show() {
        state.show();
    }

    void next() {
        state = state.next();
    }
}

