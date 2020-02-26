package com.company;

public final class FootballPlayer extends Sportsman {
    private TopClubs theClub;

    public FootballPlayer(String name, int age, TopClubs theClub, Equipment equipment) {
        super(name, age);
        this.theClub = theClub;
    }

    public FootballPlayer(String name, int age, TopClubs theClub) {
        super(name, age);
        this.theClub = theClub;
    }

    public TopClubs getTheClub() {
        return theClub;
    }
    @Override
    public final String getInfo(){
        return super.getInfo() + " " + theClub;
    }
}
