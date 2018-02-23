package com.example.demo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@ToString(exclude = "id")
class SMS implements Message {

    private long id;
    String telFrom;
    String telTo;
    String message;

    SMS(String telFrom, String telTo, String message) {
        this.telFrom = telFrom;
        this.telTo = telTo;
        this.message = message;
    }
}
