package com.example.gagansaurabhpractice.model;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.example.gagansaurabhpractice.entity.Contact;

public class Response {
	private String error;
	private HttpStatus status;
	private List<Contact> contact;
	
	public Response(String error, HttpStatus status, List<Contact> contact) {
		super();
		this.error = error;
		this.status = status;
		this.contact =  contact;
	}
	public Response() {
		// TODO Auto-generated constructor stub
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	
}
