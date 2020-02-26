package com.company;

public final class FootballPlayer extends Sportsman {
    private TopClubs theClub;
    private Equipment equipment;

    public FootballPlayer(String rules, int quantityOfPlayers, String name, int age, TopClubs theClub, Equipment equipment) {
        super(rules, quantityOfPlayers, name, age);
        this.theClub = theClub;
        this.equipment = equipment;
    }

    public FootballPlayer(String rules, int quantityOfPlayers, String name, int age, TopClubs theClub) {
        super(rules, quantityOfPlayers, name, age);
        this.theClub = theClub;
    }

    public TopClubs getTheClub() {
        return theClub;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    @Override
    public void training(String ballKicking) {
        super.training(ballKicking);
    }

    @Override
    public final String getInfo() {
        return super.getInfo() + " " + theClub;
    }
}
