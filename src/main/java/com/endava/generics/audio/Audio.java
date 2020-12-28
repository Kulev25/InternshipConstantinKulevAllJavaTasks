package com.endava.generics.audio;

public abstract class Audio {
    private int id;
    private String name;
    private Integer serialNumber;
    private String genre;
    private Double price;

    public Audio(int id, String name, Integer serialNumber, String genre, Double price) {
        this.id = id;
        this.name = name;
        this.serialNumber = serialNumber;
        this.genre = genre;
        this.price = price;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getGenre() {
        return genre;
    }

    public Double getPrice() {
        return price;
    }


}
