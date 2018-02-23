package com.example.demo;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class RepoImpl implements Repo {

    private AtomicLong counter = new AtomicLong(0L);
    private Map<Long, Message> store = new ConcurrentHashMap<>();

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

    @Override
    public Message getById(long id) {
        return store.get(id);
    }
}
