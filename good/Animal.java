package com.company;
public class Animal {
    private String isim;
    private String rengi;

    public Animal(String isim,String rengi){
        this.rengi=rengi;
        this.isim=isim;
    }




    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }
}
