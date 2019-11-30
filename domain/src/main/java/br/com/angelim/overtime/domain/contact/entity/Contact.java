package br.com.angelim.overtime.domain.contact.entity;

public class Contact {

    private String email;

    private Contact() {
    }

    private Contact(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static Contact of(String email) {
        return new Contact(email);
    }

}