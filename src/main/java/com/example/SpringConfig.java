package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    //configuration witout xml file
    //confuguration without annotations component and autowired

    @Bean
    public ClassicalMusic classicMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicMusic());
    }

    /*@Bean
    Computer computer() {
        return new Computer(musicPlayer());
    }*/

}
