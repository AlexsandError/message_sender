package com.example.demo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString(exclude = "id")
class SMS implements Message {

    private long id;
    String telFrom;
    String telTo;
    String message;
}
