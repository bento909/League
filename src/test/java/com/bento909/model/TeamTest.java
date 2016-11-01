package com.bento909.model;

import com.google.common.collect.ImmutableList;

public class TeamTest {

    private static final Team TEST_TEAM = new Team("Test1", ImmutableList.of(
            Match.builder()
                    .build(),
            Match.builder()
                    .build()));

    private Match match;

    public void testCompareTo() {
    }

}
