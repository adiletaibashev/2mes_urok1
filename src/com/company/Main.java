package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter romashka = new Shelter("romashka ", "ul pervomaiskae 9 ");
        Dog laika = new Dog("laika", "shavka", EnumColor.WHITE,romashka, new String[]{"Сидеть","Лежать"});
        System.out.println(laika.getInfo());
        laika.makeVoice();


    }
}
