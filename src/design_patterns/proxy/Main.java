package design_patterns.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("profile.png");
        System.out.println("Image object created");
        image.display();
    }
}

interface Image {
    void display();
}

class RealImage implements Image {
    private final String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

class ImageProxy implements Image {
    private final String fileName;
    private RealImage realImage;

    ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

