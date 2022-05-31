package com.company;

public class Kedi extends  Animal{
    private String mamaAdi;

    public Kedi(String isim, String rengi, String mamaAdi) {
        super(isim, rengi);
        this.mamaAdi = mamaAdi;
    }

    public String getMamaAdi() {
        return mamaAdi;
    }

    public void setMamaAdi(String mamaAdi) {
        this.mamaAdi = mamaAdi;
    }
}
