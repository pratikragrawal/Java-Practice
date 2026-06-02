// Player class (superclass)
class Player {
    protected String name;
    protected int age;
    protected String position;

    // Constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Methods
    public void play() {
        System.out.println(name + " is playing.");
    }

    public void train() {
        System.out.println(name + " is training.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}

// Cricket_Player subclass
class Cricket_Player extends Player {
    private String battingStyle;

    // Constructor
    public Cricket_Player(String name, int age, String position, String battingStyle) {
        super(name, age, position);
        this.battingStyle = battingStyle;
    }

    // Overridden method
    public void play() {
        System.out.println(name + " is batting with " + battingStyle + " style.");
    }

    public void displayCricketDetails() {
        displayDetails();
        System.out.println("Batting Style: " + battingStyle);
    }
}

// Football_Player subclass
class Football_Player extends Player {
    private String foot;

    // Constructor
    public Football_Player(String name, int age, String position, String foot) {
        super(name, age, position);
        this.foot = foot;
    }

    // Overridden method
    public void play() {
        System.out.println(name + " is playing with their " + foot + " foot.");
    }

    public void displayFootballDetails() {
        displayDetails();
        System.out.println("Foot: " + foot);
    }
}

// Hockey_Player subclass
class Hockey_Player extends Player {
    private String stickSide;

    // Constructor
    public Hockey_Player(String name, int age, String position, String stickSide) {
        super(name, age, position);
        this.stickSide = stickSide;
    }

    // Overridden method
    public void play() {
        System.out.println(name + " is playing with their stick on the " + stickSide + " side.");
    }

    public void displayHockeyDetails() {
        displayDetails();
        System.out.println("Stick Side: " + stickSide);
    }
}

// Main class
public class ex52 {
    public static void main(String[] args) {
        // Create objects
        Cricket_Player cricketPlayer = new Cricket_Player("John Doe", 30, "Batsman", "Right-handed");
        Football_Player footballPlayer = new Football_Player("Jane Smith", 25, "Forward", "Left");
        Hockey_Player hockeyPlayer = new Hockey_Player("Bob Johnson", 28, "Midfielder", "Right");

        // Display details and play
        System.out.println("Cricket Player:");
        cricketPlayer.displayCricketDetails();
        cricketPlayer.play();
        cricketPlayer.train();

        System.out.println("\nFootball Player:");
        footballPlayer.displayFootballDetails();
        footballPlayer.play();
        footballPlayer.train();

        System.out.println("\nHockey Player:");
        hockeyPlayer.displayHockeyDetails();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
