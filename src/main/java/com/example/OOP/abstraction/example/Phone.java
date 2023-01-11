package com.example.OOP.abstraction.example;

public abstract class Phone {

    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    // note - no method body in abstract methods - this is up to each subclass to add their own implementation
    public abstract void switchOn();

    public abstract void makeCall();

}
