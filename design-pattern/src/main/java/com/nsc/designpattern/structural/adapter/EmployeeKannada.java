package com.nsc.designpattern.structural.adapter;

public class EmployeeKannada {
    private String ekamaatra;
    private String modalaneHesaru;
    private String koneyaHesaru;
    private String tapalu;

    public EmployeeKannada(String ekamaatra, String modalaneHesaru, String koneyaHesaru, String tapalu) {
        this.ekamaatra = ekamaatra;
        this.modalaneHesaru = modalaneHesaru;
        this.koneyaHesaru = koneyaHesaru;
        this.tapalu = tapalu;
    }

    public String getEkamaatra() {
        return ekamaatra;
    }

    public String getModalaneHesaru() {
        return modalaneHesaru;
    }

    public String getKoneyaHesaru() {
        return koneyaHesaru;
    }

    public String getTapalu() {
        return tapalu;
    }
}
