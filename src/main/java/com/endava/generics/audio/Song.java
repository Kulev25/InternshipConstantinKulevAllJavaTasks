package com.endava.generics.audio;

public class Song extends Audio{
    private String singer;
    private String author;

    public Song(int id, String name, Integer serialNumber, String genre, Double price, String singer, String author) {
        super(id, name, serialNumber, genre, price);
        this.singer = singer;
        this.author = author;
    }

    public String getSinger() {
        return singer;
    }

    public String getAuthor() {
        return author;
    }

}
