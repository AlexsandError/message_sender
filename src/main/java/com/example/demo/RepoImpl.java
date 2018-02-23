package com.example.demo;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class RepoImpl implements Repo {

    AtomicLong counter = new AtomicLong(0L);
    Map<Long, Message> store = new ConcurrentHashMap<>();

    @Override
    public long saveMessage(Message msg) {
        long id = counter.incrementAndGet();
        msg.setId(id);
        store.put(id, msg);
        return id;
    }

    @Override
    public Collection<Message> getAll() {
        return store.values();
    }
}
