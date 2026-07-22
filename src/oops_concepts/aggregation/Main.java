package oops_concepts.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Aman");
        Team team = new Team("Blue Team");

        team.addPlayer(player);
        team.showPlayers();
    }
}

class Player {
    private final String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Team {
    private final String name;
    private final List<Player> players = new ArrayList<>();

    Team(String name) {
        this.name = name;
    }

    void addPlayer(Player player) {
        players.add(player);
    }

    void showPlayers() {
        for (Player player : players) {
            System.out.println(player.getName() + " plays for " + name);
        }
    }
}

