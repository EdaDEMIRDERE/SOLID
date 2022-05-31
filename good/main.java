package com.company;
public class Main {

    public static void main(String[] args) {

        Kopek kopek=new Kopek("Kucukucu", " Sari", " Golden");
        Kedi kedi=new Kedi(" Boncuk", " beyaz", " blabla");
        Ses ses=new Ses();
        ses.havhav(kopek);
        ses.meowMeow(kedi);
    }
}