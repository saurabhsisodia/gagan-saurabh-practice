package com.example.gagansaurabhpractice.controller;

import java.util.List;


import com.example.gagansaurabhpractice.model.Request;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gagansaurabhpractice.entity.Contact;
import com.example.gagansaurabhpractice.model.Response;
import com.example.gagansaurabhpractice.service.ContactService;

@RestController
@Slf4j
public class ContactController {

	@Autowired
	ContactService conService;

//	private static final Logger LOGGER = LogManager.getLogger(ContactController.class);

	@PostMapping("/contact")
	public Response createContact(@RequestBody Request request){
		log.info("creating new contacts with request body : {} ",request);
		return conService.createContact(request);
	}
	@GetMapping("/contacts")
	public Response getAllContacts(){
		log.info("get called for all the contacts");
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
