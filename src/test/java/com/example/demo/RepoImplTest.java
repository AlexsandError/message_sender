package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepoImplTest {

    Repo repo = new RepoImpl();
    Message msg = new SMS("+1", "+2", "test message");

    @Test
    public void saveMessage() {
        assertEquals("First element should have id = 1", 1L, repo.saveMessage(new Email()));
        assertEquals("Second element should have id = 2", 2L, repo.saveMessage(new SMS()));
    }

    @Test
    public void getAll() {
        assertEquals("Empty repo", 0L, repo.getAll().size());
        repo.saveMessage(msg);
        assertEquals("Repo with one message", 1L, repo.getAll().size());
        assertEquals("Retrieve the same message", msg, repo.getAll().iterator().next());
    }

    @Test
    public void getById() {
        repo.saveMessage(new Email());
        long id = repo.saveMessage(msg);
        repo.saveMessage(new SMS());
        assertEquals("Retrieve the same message", msg, repo.getById(id));
    }
}