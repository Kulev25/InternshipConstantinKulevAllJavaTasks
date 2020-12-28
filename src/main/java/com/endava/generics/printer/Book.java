package com.endava.generics.printer;

public class Book extends Printer {
    private String author;
    private String genre;

    public Book(int id, String name, Integer quantity, Double price, String author, String genre) {
        super(id, name, quantity, price);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

}
