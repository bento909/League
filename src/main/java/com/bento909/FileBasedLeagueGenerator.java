package com.bento909;

import com.bento909.model.League;
import com.bento909.model.Match;
import com.bento909.model.Result;
import com.bento909.model.Team;
import com.google.common.collect.ImmutableSet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileBasedLeagueGenerator implements LeagueGenerator {

    private static final int HOME_TEAM_NAME_INDEX = 0;
    private static final int OPPOSITION_TEAM_NAME_INDEX = 1;
    private static final int GOALS_FOR_INDEX = 2;
    private static final int GOALS_AGAINST_INDEX = 3;
    private static final int VENUE_INDEX = 4;
    private static final int DATE_MATCH_PLAYED_INDEX = 5;
    private static final int MAN_OF_THE_MATCH_INDEX = 6;
    private CsvParser csvParser;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");

    public FileBasedLeagueGenerator(String filename) {
        csvParser = new CsvParser(filename);
    }


    @Override
    public League generateLeague() throws IOException, ParseException {
        List<List<String>> fileContents = csvParser.parseFile();
        Map<String, List<Match>> teamMap = new HashMap<>();
        for (List<String> fileLine : fileContents){
            String team = fileLine.get(HOME_TEAM_NAME_INDEX);
            Match match = generateMatch(fileLine);
            addTeamToTeamMap(teamMap, team, match);
        }
        return new League(addTeamsToTreeSet(teamMap));
    }

    private Match generateMatch(List<String> fileLine) throws ParseException {
        return Match.builder()
                .withOpposition(fileLine.get(OPPOSITION_TEAM_NAME_INDEX))
                .withResult(new Result(
                        Integer.parseInt(fileLine.get(GOALS_FOR_INDEX)),
                        Integer.parseInt(fileLine.get(GOALS_AGAINST_INDEX))))
                .withVenue(fileLine.get(VENUE_INDEX))
                .withMatchPlayed(simpleDateFormat.parse(fileLine.get(DATE_MATCH_PLAYED_INDEX)))
                .withManOfTheMatch(fileLine.get(MAN_OF_THE_MATCH_INDEX))
                .build();
    }

    private Map<String, List<Match>> addTeamToTeamMap (Map<String, List<Match>> teamMap, String team, Match match) {
        if (!teamMap.containsKey(team)) {
            teamMap.put(team, new ArrayList<>());
        }
        teamMap.get(team).add(match);
        return teamMap;
    }

    private Set<Team> addTeamsToTreeSet (Map<String, List<Match>> teamMap) {
        ImmutableSet.Builder<Team> teams = ImmutableSet.builder();
        for (Map.Entry<String, List<Match>> entry : teamMap.entrySet()) {
            teams.add(new Team(entry.getKey(),entry.getValue()));
        }
        return teams.build();
    }

}