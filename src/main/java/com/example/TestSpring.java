package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");

        MusicPlayer mp  = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(mp.getName());
        System.out.println(mp.getValue());

        ClassicalMusic cm1 = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic cm2 = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(cm1==cm2);



//        Computer com = context.getBean("computer",Computer.class);
//        System.out.println(com);

        //MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
        //musicPlayer1.playMusic();
        /*Music music = context.getBean("rockMusic",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        ClassicalMusic music2 = context.getBean("classicalMusic",ClassicalMusic.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music2);
        musicPlayer1.playMusic();*/


        context.close();


    }
}
