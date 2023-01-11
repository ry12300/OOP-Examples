package com.example.OOP.inheritance.example;

// note - our custom exception extends the existing RuntimeException exception in the java core library
public class CustomBusinessException extends RuntimeException {

    public CustomBusinessException(String message) {
        super(message);
    }
}
