package com.springboottask1.task1.Controller;

public class Customer {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private String gender;



    public Customer() {
        // Default constructor
    }

    public Customer(int id, String name, String phoneNumber, String email, String gender) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
