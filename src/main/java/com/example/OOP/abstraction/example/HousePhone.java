package com.example.OOP.abstraction.example;

public class HousePhone extends Phone {

    public HousePhone(String brand) {
        super(brand);
    }

    @Override
    public void switchOn() {
        System.out.println("Plugging House Phone into mains...");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call from House Phone...");
    }

}
