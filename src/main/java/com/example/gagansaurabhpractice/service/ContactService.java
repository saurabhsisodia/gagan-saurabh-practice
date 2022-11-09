package com.example.gagansaurabhpractice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.gagansaurabhpractice.entity.Contact;
import com.example.gagansaurabhpractice.model.Response;
import com.example.gagansaurabhpractice.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contactRepo;
	
	
	
	
	public Response getContacts(){
		Response response = new Response();
		List<Contact> contacts =  contactRepo.findAll();
		response.setContact(contacts);
		response.setError(null);
		response.setStatus(HttpStatus.OK);
		 
		 return response;
	}
	
	public Response getContact(int id) {
		Response response = new Response();
		List<Contact> conList = new ArrayList<>();
		Contact contact =  contactRepo.findById(id)
                .orElse(null);
		
		if(contact != null) {
			conList.add(contact);
			response.setStatus(HttpStatus.OK);
			response.setContact(conList);
			response.setError(null);
		}else {
			response.setStatus(HttpStatus.NOT_FOUND);
			response.setContact(null);
			response.setError("Record Not Found!");
		}
		
		return response;	
	}
	
	public Response updateContact(int id,Contact contact) {
		
		Response response = new Response();
		List<Contact> conList = new ArrayList<>();
		
		
		Contact newContact =  contactRepo.findById(id)
                .orElse(null);
		if(newContact != null) {
			newContact.setFull_name(contact.getFull_name());
			newContact.setEmailid(contact.getEmailid());
			newContact.setMobile_number(contact.getMobile_number());
			contactRepo.save(newContact);
			conList.add(newContact);
			response.setStatus(HttpStatus.OK);
			response.setContact(conList);
			response.setError(null);
			
		}else {
			contactRepo.save(contact);
			conList.add(contact);
			response.setStatus(HttpStatus.CREATED);
			response.setContact(conList);
			response.setError("Record Not Found but Created!");
		}
		
		return response;
	}
	
	
}
