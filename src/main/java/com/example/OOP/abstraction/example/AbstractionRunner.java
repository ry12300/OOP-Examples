package com.example.OOP.abstraction.example;

public class AbstractionRunner {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Samsung");
        smartPhone.switchOn();
        smartPhone.connectToBluetooth();
        smartPhone.makeCall();

        HousePhone housePhone = new HousePhone("BT");
        housePhone.switchOn();
        housePhone.makeCall();
    }

}
