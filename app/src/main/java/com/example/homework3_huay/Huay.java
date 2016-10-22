package com.example.homework3_huay;

public class Huay {

    public String getRandomTwoDigits(){
        int random1= (int) (Math.random()*10);
        int random2= (int) (Math.random()*10);
        String str=random1+""+random2;
        return str;
    }
    public String getRandomThreeDigits(){
        int random1= (int) (Math.random()*10);
        int random2= (int) (Math.random()*10);
        int random3= (int) (Math.random()*10);
        String str=random1+""+random2+""+random3;
        return str;
    }
}
