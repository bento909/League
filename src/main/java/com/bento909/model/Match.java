package com.bento909.model;

import java.util.Date;

public class Match {
    
    private final String opposition;
    private final Date matchPlayed;
    private final String venue;
    private final String manOfTheMatch;
    private final Result result;

    private Match(String opposition, Date matchPlayed, String venue, String manOfTheMatch, Result result) {
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

    public String getVenue() {
        return venue;
    }

    public String getManOfTheMatch() {
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
        private String venue;
        private String manOfTheMatch;
        private Result result;
        
        public Builder withOpposition(String opposition) {
            this.opposition = opposition;
            return this;
        }

        public Builder withMatchPlayed(Date matchPlayed) {
            this.matchPlayed = matchPlayed;
            return this;
        }

        public Builder withVenue(String venue) {
            this.venue = venue;
            return this;
        }

        public Builder withManOfTheMatch(String manOfTheMatch) {
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
