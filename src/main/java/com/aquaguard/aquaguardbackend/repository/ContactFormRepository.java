package com.aquaguard.aquaguardbackend.repository;

import com.aquaguard.aquaguardbackend.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {
}