package com.endava.generics.video;

public class TvShow extends  Video{
    private String channel;
    private Double rating;

    public TvShow(int id, String name, String format, Double price, String channel, Double rating) {
        super(id, name, format, price);
        this.channel = channel;
        this.rating = rating;
    }

    public String getChannel() {
        return channel;
    }

    public Double getRating() {
        return rating;
    }

}
