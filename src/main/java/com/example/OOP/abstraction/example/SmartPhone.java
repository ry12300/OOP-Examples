package com.example.OOP.abstraction.example;

public class SmartPhone extends Phone {

    public SmartPhone(String brand) {
        super(brand);
    }

    @Override
    public void switchOn() {
        System.out.println("Pressing button to switch on SmartPhone...");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call from Smart Phone...");
    }

    // note - this method is unique to SmartPhone object - it is not inherited from the Abstract Phone superclass
    public void connectToBluetooth(){
        System.out.println("Connecting to bluetooth...");
    }

}
