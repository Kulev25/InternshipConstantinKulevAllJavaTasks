package com.endava.generics.video;

public class Video {
    private final int id;
    private final String name;
    private final String format;
    private final Double price;

    public Video(int id, String name, String format, Double price) {
        this.id = id;
        this.name = name;
        this.format = format;
        this.price = price;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public Double getPrice() {
        return price;
    }

}
