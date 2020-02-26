package com.company;

public class Main {

    public static void main(String[] args) {
        Sportsman tennisPlayer = new Sportsman("Aza", 20);
        System.out.println(tennisPlayer.getInfo());
        tennisPlayer.training(1);


        Equipment equipmentM = new Equipment("Blue and Red", "Adidas", 42);
        FootballPlayer Player1 = new FootballPlayer("Messi", 32, TopClubs.BARCELONA, equipmentM);
        System.out.println(Player1.getInfo());
        Player1.training("Free Kicks", 5);

        FootballPlayer Player2 = new FootballPlayer("Aguero", 31, TopClubs.MANCHESTERCITY);
        System.out.println(Player2.getInfo());
        Player2.training("Penalty Kick");
    }
}
