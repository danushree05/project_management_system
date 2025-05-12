package com.pms.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.pms.model.Contact;
import com.pms.pms.repository.ContactRepo;
@Service
public class ContactService {
    @Autowired
    ContactRepo contactRepo;

    @SuppressWarnings("null")
    public Contact addContact(Contact contact) {
        return contactRepo.save(contact);
    }
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }


    @SuppressWarnings("null")
    public Contact updateContact(Long contactId, Contact contact) {
        if (contactRepo.existsById(contactId)) {
            contact.setContactId(contactId);
            return contactRepo.save(contact);
        }
        return null;
    }

    @SuppressWarnings("null")
    public boolean deleteContact(Long contactId) {
        if (contactRepo.existsById(contactId)) {
            contactRepo.deleteById(contactId);
            return true;
        }
        return false;
   }
}
