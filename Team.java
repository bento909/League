package com.ben.model;

import java.util.List;

public class Team implements Comparable<Team> {

    private final String teamName;
    private List<Match> matches;

    public Team(String teamName, List<Match> matches) {
        this.teamName = teamName;
        this.matches = matches;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public int getPoints() {
        int points = 0;
        for (Match match : matches) {
            points += match.getResult().getOutcome().getPoints();
        }
        return points;
    }

    @Override
    public int compareTo(Team other) {
        Integer.compare(other.getPoints(),this.getPoints());
        //we also need to compare goal difference etc
    }
}
