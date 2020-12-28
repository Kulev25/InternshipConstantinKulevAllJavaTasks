package com.endava.generics.exeptions;

public class ItemNotFoundById extends RuntimeException{
    public ItemNotFoundById(int id) {
        super("Not found by ID " + id);
    }
}
