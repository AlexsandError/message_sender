package com.example.demo;

import java.util.Collection;

public interface Repo {
    long saveMessage(Message msg);
    Collection<Message> getAll();
}
