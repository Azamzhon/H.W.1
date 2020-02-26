package com.company;

public abstract class Sport {
    private String rules;
    private int quantityOfPlayers;

    public Sport(String rules, int quantityOfPlayers) {
        this.rules = rules;
        this.quantityOfPlayers = quantityOfPlayers;
    }

    public String getRules() {
        return rules;
    }

    public int getQuantityOfPlayers() {
        return quantityOfPlayers;
    }
}
