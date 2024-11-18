package com.aquaguard.aquaguardbackend.service;

import com.aquaguard.aquaguardbackend.model.ContactForm;
import com.aquaguard.aquaguardbackend.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactFormService {

    @Autowired
    private ContactFormRepository contactFormRepository;

    public ContactForm saveContactForm(ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }

}