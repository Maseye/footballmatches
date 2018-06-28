package fmatchsim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String teamName;
    private List<Player> players;
    private Coach coach;
    private final int numberOfPlayers = 11;

    public Team(String teamName, List<Player> players, Coach coach) {
        this.teamName = teamName;
        this.players = players;
        this.coach = coach;
    }

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = getGenericPlayers();
        this.coach = getGenericCoach();
    }

    public List<Player> getGenericPlayers() {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player("Player" + (i + 1), " of team " + teamName, "10.10.1111"));
        }
        return players;
    }

    public Coach getGenericCoach() {
        return new Coach("Coach of team ", teamName, "01.01.1234");
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", players=" + players +
                ", coach=" + coach +
                '}';
    }
}
