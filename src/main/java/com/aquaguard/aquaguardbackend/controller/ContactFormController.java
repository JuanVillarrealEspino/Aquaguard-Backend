package com.aquaguard.aquaguardbackend.controller;

import com.aquaguard.aquaguardbackend.model.ContactForm;
import com.aquaguard.aquaguardbackend.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactFormController {

    @Autowired
    private ContactFormService contactFormService;

    @PostMapping
    public ResponseEntity<ContactForm> submitContactForm(@RequestBody ContactForm contactForm) {
        ContactForm savedForm = contactFormService.saveContactForm(contactForm);
        return new ResponseEntity<>(savedForm, HttpStatus.CREATED);
    }

}