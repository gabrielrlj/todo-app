package com.example.demo;

public class Hello {
    private String message;

    public Hello(String message){
        this.setMessage(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
