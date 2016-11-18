package com.bento909.model;

import com.google.common.collect.ImmutableList;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TeamTest {
    Calendar calendar = new GregorianCalendar(2013,10,28);
    SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
    try
        Date date1 = dF.parse("19/09/1980");
    catch(parseException e)
    private static final Team TEST_TEAM = new Team("Test1", ImmutableList.of(
            Match.builder().withOpposition("Everton"),
            Match.builder().withMatchPlayed(dF.parse("19/09/1980")),
            Match.builder().withVenue("Goodison Park"),
            Match.builder().withManOfTheMatch("Gareth Barry"),
            Match.builder().withResult(new Result(0,1))
                    .build(),
            Match.builder().withOpposition("Liverpool"),
            Match.builder().withMatchPlayed(20/09/1980),
            Match.builder().withVenue("Anfield"),
            Match.builder().withManOfTheMatch("Lucas Leiva"),
            Match.builder().withResult(new Result(1,2))
                    .build(),
            Match.builder().withOpposition("Arsenal"),
            Match.builder().withMatchPlayed(21/09/1980),
            Match.builder().withVenue("Wherever Arsenal Play"),
            Match.builder().withManOfTheMatch("Some Arsenal Player"),
            Match.builder().withResult(new Result(2,1))
                    .build(),
            Match.builder().withOpposition("Leicester"),
            Match.builder().withMatchPlayed(Date.doSomething),
            Match.builder().withVenue("King Power"),
            Match.builder().withManOfTheMatch("Jamie Vardy"),
            Match.builder().withResult(new Result(3,1))
            .build()));

    private Match match;

    public void testCompareTo() {
    }
//I don't know the syntax for entering a date - I have looked and it seems

}
