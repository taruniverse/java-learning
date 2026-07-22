package design_patterns.prototype;

public class Main {
    public static void main(String[] args) {
        GameCharacter original = new GameCharacter("Warrior", 100);
        GameCharacter copy = original.copy();
        copy.setName("Warrior Copy");

        System.out.println(original);
        System.out.println(copy);
    }
}

class GameCharacter {
    private String name;
    private final int health;

    GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    GameCharacter copy() {
        return new GameCharacter(name, health);
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " has " + health + " health";
    }
}

