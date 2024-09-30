public class SoccerPlayer {


    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    public SoccerPlayer(String name, int age, String team, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }

    public SoccerPlayer(String name, int age, int scoredGoals) {
        this(name, age, "Unknown", scoredGoals);  // Calls the first constructor
    }

    public SoccerPlayer(String name, int age, String team) {
        this(name, age, team, 0);  // Calls the first constructor
    }

    @Override
    public String toString() {
        return "SoccerPlayer { " +
                "Name: '" + name + "', " +
                "Age: " + age + ", " +
                "Team: '" + team + "', " +
                "Goals: " + scoredGoals +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        SoccerPlayer other = (SoccerPlayer) obj;
        return scoredGoals == other.scoredGoals && team.equals(other.team);
    }

    public static void main(String[] args) {
        // Create several SoccerPlayer objects
        SoccerPlayer player1 = new SoccerPlayer("Prince", 18, "AC Milan", 20);
        SoccerPlayer player2 = new SoccerPlayer("Huseyin", 20, "Barcelona", 15);
        SoccerPlayer player3 = new SoccerPlayer("Guled", 21, "PSG");
        SoccerPlayer player4 = new SoccerPlayer("Ali", 23, 10);
        SoccerPlayer player5 = new SoccerPlayer("Temesghen", 22, "Real Madrid", 48);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);

        System.out.println("\nComparing player1 and player2: " + player1.equals(player2));  // false
        System.out.println("Comparing player2 and player5: " + player2.equals(player5));    // false
        System.out.println("Comparing player2 with itself: " + player2.equals(player2));    // true
    }
}
