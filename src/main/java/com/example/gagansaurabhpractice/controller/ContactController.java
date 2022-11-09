package com.example.gagansaurabhpractice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gagansaurabhpractice.entity.Contact;
import com.example.gagansaurabhpractice.model.Response;
import com.example.gagansaurabhpractice.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService conService;
	
	@GetMapping("/contacts")
	public Response getAllContacts(){
		return conService.getContacts();
	}
	
	@GetMapping("/contact/{id}")
	public Response getContact(@PathVariable("id") int id) {
		return conService.getContact(id);
	}
	
	@PutMapping("/contact/{id}")
	public Response updateContact(@PathVariable("id") int id,@RequestBody Contact contact) {
		return conService.updateContact(id,contact);
	}
}
