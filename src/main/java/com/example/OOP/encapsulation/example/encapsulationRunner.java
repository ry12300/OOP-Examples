package com.example.OOP.encapsulation.example;

public class encapsulationRunner {

    public static void main(String[] args) {

        Bid validBid = new Bid();
        validBid.setAmount(800); // valid input
        validBid.getAmount();

        Bid invalidBid = new Bid();
        invalidBid.setAmount(1500); // will throw error in setter as price exceeds max bid
    }

}
