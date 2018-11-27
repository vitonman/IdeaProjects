package com.company;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //TO GET OBJECT
    public String getName() {
        return name;
    }
    //TO GET OBJECT
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //CONSTRUCTOR TO CREATE OBJECT
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
