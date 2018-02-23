package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

@RestController
public class Controller {

    @Autowired
    Repo repo;

    @GetMapping("/getAll")
    @ResponseBody Collection<Message> getMessages() {
        return repo.getAll();
    }

    @PostMapping("/sms")
    ResponseEntity<?> sendSMS(@RequestBody SMS sms) {
        System.out.println(sms);
        long id = repo.saveMessage(sms);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/email")
    ResponseEntity<?> sendEmail(@RequestBody Email email) {
        System.out.println(email);
        long id = repo.saveMessage(email);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();
    }
}
