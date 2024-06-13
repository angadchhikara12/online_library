package com.company;

class Animal {
    boolean hasTail;


    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}

class Dog extends Animal{
    int legs;


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}

public class java_review {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setHasTail(true);
        System.out.printf("Animal has a tail: %b\n", animal.isHasTail());

        Dog dog = new Dog();
        dog.setHasTail(true);
        System.out.printf("Dog has a tail: %b\n", dog.isHasTail());
        dog.setLegs(4);
        System.out.printf("Dog has %d legs\n", dog.getLegs());
    }
}