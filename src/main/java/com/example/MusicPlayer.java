package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusicusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusicusic, RockMusic rockMusic) {
        this.classicalMusicusic = classicalMusicusic;
        this.rockMusic = rockMusic;
    }
//IoC

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public String playMusic() {
        return "Playing " + classicalMusicusic.getSong();

    }

    /*public void setMusic(Music music) {
        this.music = music;
    }

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
    }*/
}
