package com.endava.generics.printer;

public class Printer {
    private int id;
    private String name;
    private Integer quantity;
    private Double price;

    public Printer(int id, String name, Integer quantity, Double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

}
