package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml"
        );

        //Music musicBean = context.getBean("musicBean", Music.class);
        //MusicPlayer player = new MusicPlayer(musicBean);

        MusicPlayer firstmp = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondtmp = context.getBean("musicPlayer", MusicPlayer.class);
        boolean equal = firstmp==secondtmp;
        System.out.println(equal);

        firstmp.setValue(10);
        System.out.println(firstmp.getValue());
        System.out.println(secondtmp.getValue());
        firstmp.playMusic();
        System.out.println(firstmp.getName());
        System.out.println(firstmp.getValue());

        context.close();


    }
}
