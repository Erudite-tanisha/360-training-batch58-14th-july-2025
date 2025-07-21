package com.training.Session2_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    SportsKit kit;

    @Autowired
    public void setKit(SportsKit kit) {
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Hello, Playing Tennis";
    }

    @Override
    public String KitGranted() {
        return kit.KitGranted();
    }
}
