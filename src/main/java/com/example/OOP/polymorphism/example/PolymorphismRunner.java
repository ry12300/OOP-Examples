package com.example.OOP.polymorphism.example;

public class PolymorphismRunner {

    public static void main(String[] args) {

        Measurable building = new Building();
        building.calculateHeight();

        Measurable tree = new Tree();
        tree.calculateHeight();

        Measurable waterfall = new Waterfall();
        waterfall.calculateHeight();
    }

}
