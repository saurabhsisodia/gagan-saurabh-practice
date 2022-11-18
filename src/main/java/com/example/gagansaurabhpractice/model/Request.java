package com.example.gagansaurabhpractice.model;

public class Request {

    private String full_name;
    private String mobile_number;
    private String emailid;
    private int transaction_id;

    public Request(){}
    public Request(String full_name, String mobile_number, String emailid, int transaction_id) {
        this.full_name = full_name;
        this.mobile_number = mobile_number;
        this.emailid = emailid;
        this.transaction_id = transaction_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getEmailid() {
        return emailid;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    @Override
    public String toString() {
        return "Request{" +
                "full_name='" + full_name + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", emailid='" + emailid + '\'' +
                ", transaction_id=" + transaction_id +
                '}';
    }
}
