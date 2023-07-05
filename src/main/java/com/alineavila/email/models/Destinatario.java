package com.alineavila.email.models;

public class Destinatario {

    private int id;
    private String primeiroNome;
    private String email;

    public Destinatario(int id, String primeiroNome, String email) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
