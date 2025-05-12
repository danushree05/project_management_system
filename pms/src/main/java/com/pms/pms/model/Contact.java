package com.pms.pms.model;

// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name="contacts_us")
// @Column(name = "contact_id")

public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    Long contactId;
    String firstName;
    String lastName;
    String workEmail;
    String phoneNumber;
    String message;
    public Contact() {
    }
    public Long getContactId() {
        return contactId;
    }
    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getWorkEmail() {
        return workEmail;
    }
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    // public Contact(Long contactId, String firstName, String lastName, String workEmail, String phoneNumber,
    //         String message) {
    //     this.contactId = contactId;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.workEmail = workEmail;
    //     this.phoneNumber = phoneNumber;
    //     this.message = message;
    // }
    
}
