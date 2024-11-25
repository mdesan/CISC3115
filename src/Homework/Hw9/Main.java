package Homework.Hw9;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player[] players = getPlayersArray();

        // TODO 1 - sort the players by name in ascending order

        Arrays.sort(players, Comparator.comparing(Player::getName));

        System.out.println("players sorted by name in ascending order: " + Arrays.toString(players));

        // TODO 2 - sort the players by name in descending order

        Arrays.sort(players, Comparator.comparing(Player::getName).reversed());

        System.out.println("players sorted by name in descending order: " + Arrays.toString(players));

        // TODO 3 - sort the players by score in ascending order

        Arrays.sort(players, Comparator.comparing(Player::getScore));

        System.out.println("players sorted by score in ascending order: " + Arrays.toString(players));

        // TODO 4 - sort the players by score in descending order

        Arrays.sort(players, Comparator.comparing(Player::getScore).reversed());

        System.out.println("players sorted by score in descending order: " + Arrays.toString(players));
    }

    private static Player[] getPlayersArray() {
        return new Player[] {
                new Player("Jane", 56),
                new Player("John", 34),
                new Player("Olivia", 47),
                new Player("Kate", 67),
                new Player("Adam", 39),
                new Player("Josh", 60)
        };
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}

