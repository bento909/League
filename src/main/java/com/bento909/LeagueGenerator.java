package com.bento909;

import com.bento909.model.League;

import java.io.IOException;
import java.text.ParseException;

public interface LeagueGenerator {

    League generateLeague() throws IOException, ParseException;
}
