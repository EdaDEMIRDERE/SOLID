package com.company;

public class Kopek extends Animal {
    private  String cinsi;

    public Kopek(String isim, String rengi, String cinsi) {
        super(isim, rengi);
        this.cinsi = cinsi;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
