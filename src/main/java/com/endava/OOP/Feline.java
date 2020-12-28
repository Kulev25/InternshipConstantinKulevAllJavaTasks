package com.endava.OOP;

public class Feline extends Mammal {
    private int pawNumber;
    private int tailNumber;
    private String species;

    public Feline(String species, int numEyes, double maxWeight, int maxAge, int paws, int tail) {
        super(species, numEyes, maxWeight, maxAge);
        this.pawNumber = paws;
        this.tailNumber = tail;
    }

    public Feline() {
        super("Jaguar", 2, 50, 200);
        this.pawNumber = 3;
        this.tailNumber = 1;
    }

    public int getPaws() {
        return this.pawNumber;
    }

    public void setPaws(int pawNumber) {
        if (pawNumber == 4) this.pawNumber = pawNumber;
        else if (pawNumber >= 0 & pawNumber < 4) System.out.println("Poor feline without a pawn");
        else if (pawNumber > 4) System.out.println("Somethin is really wrong with this feline");
        else System.out.println("It's impossible");
    }


    public int getTail() {
        return this.tailNumber;
    }

    public void setTail(int tailNumber) {
        if (tailNumber == 1) this.tailNumber = tailNumber;
        else if (tailNumber == 0) System.out.println("Tailless feline");
        else if (tailNumber > 1) System.out.println("Something wrong with this feline");
        else System.out.println("It's impossible");
    }

    @Override
    public void speak(String voice) {
        System.out.println("feline say: " + voice);
    }

}