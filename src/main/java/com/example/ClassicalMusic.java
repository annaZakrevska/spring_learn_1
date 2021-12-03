package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }

    public void doMyInit(){
        System.out.println("Init...");
    }


    public void doMyDestroy(){
        System.out.println("Init...");
    }

    /*public void doMyInit() {
        System.out.println("Doing my initialization");
    }


    public void doMyDestroy() {
        System.out.println("Doing my distraction");
    }*/
}
