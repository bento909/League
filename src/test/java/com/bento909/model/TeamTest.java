package com.bento909.model;

import com.google.common.collect.ImmutableList;

import static com.bento909.model.DateMaker.generateRandomDate;

public class TeamTest {
    private static final Team TEST_TEAM = new Team("Test1", ImmutableList.of(
            Match.builder().withOpposition("Everton")
                    .withMatchPlayed(generateRandomDate())
                    .withVenue("Goodison Park")
                    .withManOfTheMatch("Gareth Barry")
                    .withResult(new Result(0, 1))
                    .build(),
            Match.builder().withOpposition("Liverpool")
                    .withMatchPlayed(generateRandomDate())
                    .withVenue("Anfield")
                    .withManOfTheMatch("Lucas Leiva")
                    .withResult(new Result(1, 2))
                    .build(),
            Match.builder().withOpposition("Arsenal")
                    .withMatchPlayed(generateRandomDate())
                    .withVenue("Wherever Arsenal Play")
                    .withManOfTheMatch("Some Arsenal Player")
                    .withResult(new Result(2, 1))
                    .build(),
            Match.builder().withOpposition("Leicester")
                    .withMatchPlayed(generateRandomDate())
                    .withVenue("King Power")
                    .withManOfTheMatch("Jamie Vardy")
                    .withResult(new Result(3, 1))
                    .build()));

    private Match match;

    public void testCompareTo() {
    }
}
