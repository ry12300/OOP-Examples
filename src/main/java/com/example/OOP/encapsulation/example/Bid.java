package com.example.OOP.encapsulation.example;

import java.util.InputMismatchException;

public class Bid {

    private static final Integer MAX_BID_AMOUNT = 1000;

    private Integer amount;

    public Bid() {}

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {

        if(amount <= MAX_BID_AMOUNT){
            this.amount = amount;
        }else{
            throw new InputMismatchException("Bid cannot be higher than £1000!");
        }
    }

}
