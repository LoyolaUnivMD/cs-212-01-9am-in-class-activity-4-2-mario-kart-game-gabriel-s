public class MarioKartPlayer {
    private String playerName;
    private String character;
    private int speed;

    // Constructor
    public MarioKartPlayer(String playerName, String character, int startingSpeed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = startingSpeed;
    }

    // Boost method
    public void boost() {
        speed += 10; // Increase speed by 10
    }

    // Display player information
    public void displayInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }
}

