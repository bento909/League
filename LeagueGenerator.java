package com.ben.league;

import com.ben.model.League;

import java.io.IOException;
import java.text.ParseException;

public interface LeagueGenerator {

    League generateLeague() throws IOException, ParseException;
}
