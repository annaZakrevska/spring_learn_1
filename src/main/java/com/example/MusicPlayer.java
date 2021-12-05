package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.value}")
    private int value;

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


//IoC

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public String playMusic() {
        return "Playing " + music1.getSong() + " " + "Playing " + music2.getSong();
    }

    /*public void setMusic(Music music) {
        this.music = music;
    }
     }*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
