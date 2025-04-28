package game;

public class Player {
    String name;
    int score;
    int health;
    int level;
    String typeGender;

    public Player(String name, String typeGender) {
        this.name = name;
        this.typeGender = typeGender;
        this.score = 0;
        this.health = 100;
        this.level = 1;
    }

}
