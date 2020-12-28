package com.endava.OOP;

public abstract class Mammal {
    private String species;
    private int numEyes;
    private double maxWeight;
    private int maxAge;

    public Mammal() {
        this.species = "Lion";
        this.numEyes = 2;
        this.maxAge = 75;
        this.maxWeight = 500;
    }

    public Mammal(String species, int numEyes, double maxWeight, int maxAge) {
        this.species = species;
        this.numEyes = numEyes;
        this.maxWeight = maxWeight;
        this.maxAge = maxAge;
    }

    public Mammal(double maxWeight, int maxAge) {
        this.maxWeight = maxWeight;
        this.maxAge = maxAge;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getNumEyes() {
        return this.numEyes;
    }

    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }

    public double getMaxWeight() {
        return this.maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        if (maxWeight > 200000) {
            System.out.println("You're too big to be a com.endava.OOP.Mammal");
        } else this.maxWeight = maxWeight;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(int maxAge) {
        if (maxAge > 300) {
            System.out.println("Sorry, but most likely you're dead");
        } else this.maxAge = maxAge;
    }


    public void eat(String food) {
        System.out.println("Favorite food - " + food);
    }

    public abstract void speak(String voice);

}
