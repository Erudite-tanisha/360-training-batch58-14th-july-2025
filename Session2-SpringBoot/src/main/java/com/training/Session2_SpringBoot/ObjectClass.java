package com.training.Session2_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ObjectClass {

    @Autowired
    @Qualifier("cricketCoach")
    private Coach coach;

    public String hello(){
        return coach.Play();
    }
}
