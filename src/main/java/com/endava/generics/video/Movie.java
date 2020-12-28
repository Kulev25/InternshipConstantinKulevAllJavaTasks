package com.endava.generics.video;

public class Movie extends Video {
    private final String genre;
    private final Integer duration;

    public Movie(int id, String name, String format, Double price, String genre, Integer duration) {
        super(id, name, format, price);
        this.genre = genre;
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getDuration() {
        return duration;
    }

}
