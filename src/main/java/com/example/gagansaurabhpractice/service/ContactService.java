package com.example.gagansaurabhpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gagansaurabhpractice.entity.Contact;
import com.example.gagansaurabhpractice.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contactRepo;
	
	public List<Contact> getContacts(){
		return contactRepo.findAll();
	}
	
	public Contact getContact(int id) {
		return contactRepo.findById(id)
                .orElse(null);
		
	}
	
	public Contact updateContact(int id,Contact contact) {
		Contact newContact =  contactRepo.findById(id)
                .orElse(null);
		if(newContact != null) {
			newContact.setFull_name(contact.getFull_name());
			newContact.setEmailid(contact.getEmailid());
			newContact.setMobile_number(contact.getMobile_number());
			contactRepo.save(newContact);
		}else {
			contactRepo.save(contact);
		}
		return contact;
	}
	
	
}
