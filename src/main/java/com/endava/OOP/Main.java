package com.endava.OOP;

public abstract class Main {
    public static void main(String[] args) {

        Feline jaguar = new Feline();
        System.out.println(jaguar.getSpecies());
        System.out.println(jaguar.getNumEyes());
        System.out.println(jaguar.getMaxAge());
        System.out.println(jaguar.getMaxWeight());
        System.out.println(jaguar.getPaws());
        System.out.println(jaguar.getTail());
        System.out.println();

        Feline lion = new Feline("Lion", 2, 400, 40, 4, 1);
        System.out.println(lion.getSpecies());
        System.out.println(lion.getNumEyes());
        System.out.println(lion.getMaxAge());
        System.out.println(lion.getMaxWeight());
        System.out.println(lion.getPaws());
        System.out.println(lion.getTail());
        System.out.println();

        Cat barsik = new Cat();
        barsik.eat(" everything");
        barsik.speak("Murr");
        barsik.shedding("Barsik");

        Human person = new Human("James Bond", 90, 185, 33, 190);
        System.out.println(person.getName());
        System.out.println(person.getMaxAge());
        System.out.println(person.getHeight());
        System.out.println();

        person.tellMeYouBio();
        person.speak(" 3 languages");
        person.eat("barbeque");

    }
}
