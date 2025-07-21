package org.training;

public class CricketCoach implements ScoreBoard{

    SportsKit sportsKit;

    public CricketCoach(SportsKit sportsKit) {  //constructor based DI
        this.sportsKit = sportsKit;
    }

    @Override
    public String Play() {
        return "Hello, I'm playing cricket";
    }

    @Override
    public String KitGranted() {
        return sportsKit.KitGranted();
    }
}
