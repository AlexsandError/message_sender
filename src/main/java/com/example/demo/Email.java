package com.example.demo;

public class Email implements Message {

    private long id;
    String addressFrom;
    String addressTo;
    String message;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
