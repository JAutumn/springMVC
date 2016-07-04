package com.springMVC.services.interfaces;

import com.springMVC.entity.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
