package design_patterns.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie();
    }
}

class Projector {
    void on() {
        System.out.println("Projector on");
    }
}

class SoundSystem {
    void on() {
        System.out.println("Sound system on");
    }
}

class StreamingApp {
    void play() {
        System.out.println("Movie playing");
    }
}

class HomeTheaterFacade {
    private final Projector projector = new Projector();
    private final SoundSystem soundSystem = new SoundSystem();
    private final StreamingApp app = new StreamingApp();

    void watchMovie() {
        projector.on();
        soundSystem.on();
        app.play();
    }
}

