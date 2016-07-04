package com.springMVC.entity;

import org.springframework.data.domain.Page;

import java.util.List;

public class ContactGrid {
    private final int totalPages;
    private final int currentPage;
    private final long totalRecords;
    private final List<Contact> contactData;
    
    public ContactGrid(Page<Contact> contactPage) {
        currentPage = contactPage.getNumber() + 1;
        totalPages = contactPage.getTotalPages();
        totalRecords = contactPage.getTotalElements();
        contactData = contactPage.getContent();
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public List<Contact> getContactData() {
        return contactData;
    }
}
