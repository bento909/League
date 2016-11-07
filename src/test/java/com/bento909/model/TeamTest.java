package com.bento909.model;

import com.google.common.collect.ImmutableList;

public class TeamTest {

    private static final Team TEST_TEAM = new Team("Test1", ImmutableList.of(
            Match.builder("Everton", 12/22/2016, "Goodison Park", "Gareth Barry",new Result(0,1) )
                    .build(),
            //Steve, this can't be right? Surely you have to call withOpposition etc?
            Match.builder()
                    .build()));

    private Match match;

    public void testCompareTo() {
    }

}
