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

public class MarioKartGame {
    public static void main(String[] args) {
        // Instantiate players
        MarioKartPlayer player1 = new MarioKartPlayer("Player 1", "Mario", 50);
        MarioKartPlayer player2 = new MarioKartPlayer("Player 2", "Luigi", 40);

        // Display initial player information
        System.out.println("Initial Player Information:");
        player1.displayInfo();
        System.out.println(); // Blank line
        player2.displayInfo();
        System.out.println(); // Blank line

        // Simulate boost action for each player
        player1.boost();
        player2.boost();

        // Display updated player information after boost
        System.out.println("Player Information After Boost:");
        player1.displayInfo();
        System.out.println(); // Blank line
        player2.displayInfo();
    }
}
