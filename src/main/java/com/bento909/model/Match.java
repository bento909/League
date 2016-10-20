package com.bento909.model;

import java.util.Date;

public class Match {
    
    private final String opposition;
    private final Date matchPlayed;
    private final java.lang.String venue;
    private final java.lang.String manOfTheMatch;
    private final Result result;

    private Match(String opposition, Date matchPlayed, java.lang.String venue, java.lang.String manOfTheMatch, Result result) {
        this.opposition = opposition;
        this.matchPlayed = matchPlayed;
        this.venue = venue;
        this.manOfTheMatch = manOfTheMatch;
        this.result = result;
    }

    public String getOpposition() {
        return opposition;
    }

    public Date getMatchPlayed() {
        return matchPlayed;
    }

    public java.lang.String getVenue() {
        return venue;
    }

    public java.lang.String getManOfTheMatch() {
        return manOfTheMatch;
    }

    public Result getResult() {
        return result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String opposition;
        private Date matchPlayed;
        private java.lang.String venue;
        private java.lang.String manOfTheMatch;
        private Result result;
        
        public Builder withOpposition(String opposition) {
            this.opposition = opposition;
            return this;
        }

        public Builder withMatchPlayed(Date matchPlayed) {
            this.matchPlayed = matchPlayed;
            return this;
        }

        public Builder withVenue(java.lang.String venue) {
            this.venue = venue;
            return this;
        }

        public Builder withManOfTheMatch(java.lang.String manOfTheMatch) {
            this.manOfTheMatch = manOfTheMatch;
            return this;
        }

        public Builder withResult(Result result) {
            this.result = result;
            return this;
        }

        public Match build() {
            return new Match(opposition, matchPlayed, venue, manOfTheMatch, result);
        }

    }
}
