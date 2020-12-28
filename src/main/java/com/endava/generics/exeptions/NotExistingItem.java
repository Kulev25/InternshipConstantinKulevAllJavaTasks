package com.endava.generics.exeptions;

public class NotExistingItem extends RuntimeException{
    public NotExistingItem(String message) {
        super("Not existing item " + message);
    }
}
