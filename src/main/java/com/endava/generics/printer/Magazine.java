package com.endava.generics.printer;

public class Magazine extends Printer {
    private String type;

    public Magazine(int id, Integer quantity, Double price, String name, String type) {
        super(id, name, quantity, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
