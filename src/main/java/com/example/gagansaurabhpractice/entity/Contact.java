package com.example.gagansaurabhpractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contact {
    @Id
    @GeneratedValue
    private int id;
    
    private String full_name;
    private String mobile_number;
    private String emailid;
    
    public Contact() {}
    
    public Contact(String full_name, String mobile_number, String emailid) {
        this.full_name = full_name;
        this.mobile_number = mobile_number;
        this.emailid = emailid;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}