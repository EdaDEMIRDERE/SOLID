package com.company;
public class Animal {
    String kediAdi;
    String kopekAdi;
    String rengi;
    String cinsi;

    public Animal(String kopekAdi,String rengi,String cinsi){
        this.kopekAdi=kopekAdi;
        this.rengi=rengi;
        this.cinsi=cinsi;

    }
    public Animal(String kediAdi, String rengi){
        this.kediAdi=kediAdi;
        this.rengi=rengi;
    }

    public void havHav(String kopekAdi){
        System.out.println(kopekAdi+" havladi");
    }
    
    public void meowMeow(String kediAdi){
        System.out.println(kediAdi+" miyavladi");
    }
}
