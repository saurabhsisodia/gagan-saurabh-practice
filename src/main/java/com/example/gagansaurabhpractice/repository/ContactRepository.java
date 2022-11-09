package com.example.gagansaurabhpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gagansaurabhpractice.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>   {
	
}
