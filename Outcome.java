package com.ben.model;

public enum Outcome {

    WIN(3), DRAW(1), LOSS(0);

    private int points;

    Outcome(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
