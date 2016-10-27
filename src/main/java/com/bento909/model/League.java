package com.bento909.model;

import java.util.Set;
import java.util.TreeSet;
import com.google.common.collect.ImmutableSet;

public class League {

    private final Set<Team> teams;

    public League(TreeSet<Team> teams) {
        ImmutableSet.Builder<Team> teams = ImmutableSet.builder();

    }
}


//   private Set<Team> addTeamsToTreeSet (Map<String, List<Match>> teamMap) {
//ImmutableSet.Builder<Team> teams = ImmutableSet.builder();
   //     for (Map.Entry<String, List<Match>> entry : teamMap.entrySet()) {
 //       teams.add(new Team(entry.getKey(),entry.getValue()));
  //      }
  //      return teams.build();