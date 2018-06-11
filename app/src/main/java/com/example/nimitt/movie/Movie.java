package com.example.nimitt.movie;

public class Movie {
    String title;
    String release_date;
    String plot;
    String vote;
    int poster;

    public Movie() {
    }

    public Movie(String title, String release_date, String plot, String vote, int poster) {
        this.title = title;
        this.release_date = release_date;
        this.plot = plot;
        this.vote = vote;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getPlot() {
        return plot;
    }

    public String getVote() {
        return vote;
    }

    public int getPoster() {
        return poster;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}

