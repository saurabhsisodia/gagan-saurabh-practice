package com.example.gagansaurabhpractice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gagansaurabhpractice.entity.Contact;
import com.example.gagansaurabhpractice.model.Response;
import com.example.gagansaurabhpractice.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService conService;

	@PostMapping("/contact")
	public Response createContact(@RequestBody Contact contact){
		return conService.createContact(contact);
	}
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
	@DeleteMapping("/contact/{id}")
	public Response deleteContact(@PathVariable("id") int id){
		return conService.deleteContact(id);
	}
}
