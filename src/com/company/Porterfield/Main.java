package com.company.Porterfield;

abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void contact();
}


class EmailContact extends Contact {
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    public void contact() {
        System.out.println("You are emailing " + super.getName() + " at: " + email + " ...");
    }
}


class PhoneContact extends Contact {
    private String pNumber;

    public PhoneContact(String name, String pNumber) {
        super(name);
        this.pNumber = pNumber;
    }

    public void contact() {
        System.out.println("You are calling " + super.getName() + " at: " + pNumber + " ...");
    }
}



public class Main {

    public static void main(String[] args) {
        EmailContact contact1 = new EmailContact("Jeff", "email@gmail.com");
        PhoneContact contact2 = new PhoneContact("Bob", "123-456-7890");

        contact1.contact();
        contact2.contact();
    }
}