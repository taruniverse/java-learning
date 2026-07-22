package oops_concepts.composition;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.showRoom();
    }
}

class Room {
    void show() {
        System.out.println("This is a room");
    }
}

class House {
    private final Room room = new Room();

    void showRoom() {
        room.show();
    }
}

