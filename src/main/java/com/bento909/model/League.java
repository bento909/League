package com.bento909.model;

import com.google.common.collect.ImmutableSet;

import java.util.*;

public class League {

    private final TreeSet<Team> teams;
    //make this set an immutable set
    private League(Set<Team> teams) {
        ImmutableSet.Builder<League> league = ImmutableSet.builder();
        for (Set.Entry<>)
    }
}


//    private final TreeSet<Team> teams;

//    public League(Set<Team> teams) {
//       this.teams = new TreeSet<>(teams);
//    }
}