package game;

public class EnhancePlayer {

    private String fullName;
    private int score;
    private int health;
    private int level;
    private String weapon;

    public EnhancePlayer(String name) {
        this(name, "sword", 0, 100, 1);
    }

    public EnhancePlayer(String name, String weapon, int score, int health, int level) {
        if (name == null || weapon == null) {
            throw new IllegalArgumentException("Name and weapon must not be null");
        } else {
            this.fullName = name;
            this.weapon = weapon;
        }
        if (health <= 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }

        this.score = score;
        this.level = level;
    }


    public void hit(int hit) {
        System.out.println(this.fullName + " hit " + this.fullName);
        this.health -= hit;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println(this.fullName + " die");
        }
    }

    public void restoreHealt(int healthGain) {
        if (healthGain > 98) {
            healtoFull();
        }
    }

    public void healtoFull() {
        this.health = 100;
    }

    public void levelUp() {
        this.level++;
    }

    public void show() {
        System.out.println("Name: " + this.fullName);
        System.out.println("Weapon: " + this.weapon);
        System.out.println("Health: " + this.health);
        System.out.println("Score: " + this.score);
        System.out.println("Level: " + this.level);
    }


}
