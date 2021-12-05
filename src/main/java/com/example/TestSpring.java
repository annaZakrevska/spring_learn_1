package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(mp.getName());
        System.out.println(mp.getValue());

        ClassicalMusic cm1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic cm2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(cm1 == cm2);
        context.close();


    }
}
