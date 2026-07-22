package design_patterns.bridge;

public class Main {
    public static void main(String[] args) {
        Remote tvRemote = new BasicRemote(new Tv());
        Remote radioRemote = new BasicRemote(new Radio());

        tvRemote.turnOn();
        radioRemote.turnOn();
    }
}

interface Device {
    void powerOn();
}

class Tv implements Device {
    public void powerOn() {
        System.out.println("TV is on");
    }
}

class Radio implements Device {
    public void powerOn() {
        System.out.println("Radio is on");
    }
}

abstract class Remote {
    protected final Device device;

    Remote(Device device) {
        this.device = device;
    }

    abstract void turnOn();
}

class BasicRemote extends Remote {
    BasicRemote(Device device) {
        super(device);
    }

    void turnOn() {
        device.powerOn();
    }
}

