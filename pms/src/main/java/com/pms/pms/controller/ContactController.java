package com.pms.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.pms.model.Contact;
import com.pms.pms.service.ContactService;
@RestController
public class ContactController {
     @Autowired
    private ContactService contactService;

    
    @PostMapping("/contact/post")
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact) {
        Contact savedContact = contactService.addContact(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedContact);
    }
    @GetMapping("/contact/get")
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return ResponseEntity.ok(contacts);
    }

    @PutMapping("/contact/{contactId}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long contactId, @RequestBody Contact contact) {
        Contact updatedContact = contactService.updateContact(contactId, contact);
        if (updatedContact != null) {
            return ResponseEntity.ok(updatedContact);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/contact/{contactId}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long contactId) {
        boolean deleted = contactService.deleteContact(contactId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
