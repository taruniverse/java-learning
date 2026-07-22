package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        channel.subscribe(new Subscriber("Aman"));
        channel.subscribe(new Subscriber("Priya"));

        channel.upload("Observer Pattern in Java");
    }
}

interface Observer {
    void update(String videoTitle);
}

class Subscriber implements Observer {
    private final String name;

    Subscriber(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " received: " + videoTitle);
    }
}

class Channel {
    private final List<Observer> observers = new ArrayList<>();

    void subscribe(Observer observer) {
        observers.add(observer);
    }

    void upload(String videoTitle) {
        for (Observer observer : observers) {
            observer.update(videoTitle);
        }
    }
}

