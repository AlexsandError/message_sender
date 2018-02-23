package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString(exclude = "id")
class Email implements Message {

    private long id;
    String addressFrom;
    String addressTo;
    String message;
}
