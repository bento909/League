package com.bento909.model;

import java.util.Set;
import java.util.TreeSet;

public class League {

    private final TreeSet<Team> teams;

    public League(Set<Team> teams) {
        this.teams = new TreeSet<>(teams);
    }
}
