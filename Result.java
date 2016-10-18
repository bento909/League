package com.ben.model;

public class Result {
    private final int goalsFor;
    private final int goalsAgainst;

    public Result(int goalsFor, int goalsAgainst) {
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public Outcome getOutcome() {
        if (goalsFor > goalsAgainst) {
            return Outcome.WIN;
        } else if (goalsFor < goalsAgainst) {
            return Outcome.LOSS;
        }
        return Outcome.DRAW;
    }

}
