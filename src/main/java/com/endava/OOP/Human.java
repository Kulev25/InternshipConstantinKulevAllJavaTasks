package com.endava.OOP;

public class Human extends Mammal {
    private String name;
    private int height;
    final int fingersNumber = 20;
    private int age;
    private int maxWeight;

    public Human(String name, int MaxAge, int height, int age, int maxWeight) {
        this.name = name;
        this.height = height;
        super.setMaxAge(MaxAge);
        this.age = age;
        this.maxWeight = maxWeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Human() {
        super("human", 2, 300, 121);
        this.name = "John";
        this.height = 200;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (height >= 10 & height <= 250) this.height = height;
        else if (height > 250) System.out.println("Wow, what kind of monster are you?");
        else System.out.println("You're too little to be a human");
    }

    public void tellMeYouBio() {
        System.out.println("I am " + age + " years old " + height + " cm height and my max weight is " + maxWeight);
    }

    @Override
    public void speak(String voice) {
        System.out.println("I am a human, I know" + voice);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }
}
