package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@ToString(exclude = "id")
class Email implements Message {

    private long id;
    String addressFrom;
    String addressTo;
    String message;

    public Email(String addressFrom, String addressTo, String message) {
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.message = message;
    }
}
