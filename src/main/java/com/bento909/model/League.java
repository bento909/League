package com.bento909.model;

import java.util.TreeSet;

public class League {

    private final TreeSet<Team> teams;

    public League(TreeSet<Team> teams) {
        this.teams = teams;
    }
}
