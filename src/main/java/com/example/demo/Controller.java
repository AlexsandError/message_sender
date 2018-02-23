package com.example.demo;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

@RestController
@Log
public class Controller {

    @Autowired
    Repo repo;

    @GetMapping("/getAll")
    @ResponseBody Collection<Message> getMessages() {
        return repo.getAll();
    }

    @GetMapping("/get/{id}")
    @ResponseBody Message getById(@PathVariable long id) {
        return repo.getById(id);
    }

    @PostMapping("/sms")
    ResponseEntity<?> sendSMS(@RequestBody SMS sms) {
        long id = repo.saveMessage(sms);
        log.fine(() -> "a new SMS was sent: " + sms);
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/get/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/email")
    ResponseEntity<?> sendEmail(@RequestBody Email email) {
        long id = repo.saveMessage(email);
        log.fine(() -> "a new Email was sent: " + email);
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/get/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }
}
