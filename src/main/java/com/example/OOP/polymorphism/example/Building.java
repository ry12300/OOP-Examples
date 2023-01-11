package com.example.OOP.polymorphism.example;

public class Building implements Measurable {

    @Override
    public void calculateHeight() {
        System.out.println("Calculating Building Height...");
    }
}
