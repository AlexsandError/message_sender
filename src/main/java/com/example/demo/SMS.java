package com.example.demo;



//TODO use Lombok
public class SMS implements Message {

    private long id;
    String telFrom;
    String telTo;
    String message;

    public String getTelFrom() {
        return telFrom;
    }

    public void setTelFrom(String telFrom) {
        this.telFrom = telFrom;
    }

    public String getTelTo() {
        return telTo;
    }

    public void setTelTo(String telTo) {
        this.telTo = telTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SMS{" +
                "telFrom='" + telFrom + '\'' +
                ", telTo='" + telTo + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
