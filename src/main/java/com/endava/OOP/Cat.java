package com.endava.OOP;

public class Cat extends Feline {
    private final String breed;
    private String name;
    private final boolean hasEars;

    public Cat(String breed, String name, boolean hasEars, int maxWeight, int maxAge) {
        this.breed = breed;
        this.name = name;
        this.hasEars = hasEars;
        super.setMaxAge(maxAge);
        super.setMaxWeight(maxWeight);
    }

    public Cat() {
        this.breed = ("American Shorthair");
        this.name = ("Barsik");
        this.hasEars = true;
        super.setMaxAge(20);
        super.setMaxWeight(12);
    }

    public Cat(String breed, boolean hasEars) {
        this.breed = breed;
        this.hasEars = hasEars;
    }

    public void shedding(String name) {
        System.out.println("Our " + this.name + " is shedding so bad");
    }

    @Override
    public void speak(String voice) {
        System.out.println("I'm a cat, all I can say is - " + voice);
    }


    @Override
    public void eat(String food) {
        super.eat(food);
    }
}
