package com.nsc.designpattern.structural.adapter;

public class EmployeeLDAP {
    private final String cn;
    private final String surname;
    private final String givenName;
    private final String mail;

    public EmployeeLDAP(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}
