package com.company;

public class Sportsman extends Sport {
    private String name;
    private int age;

    public Sportsman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void training(String ballKicking) {
        System.out.println(ballKicking);
    }

    public void training(int quantity) {
        for (int i = 0; i < quantity ; i++) {
            System.out.println("Training is going");
        }
    }

    public final void training(String ballControl, int quantity) {
        for (int i = 0; i < quantity  ; i++) {
            System.out.println(ballControl);
        }
    }

    public String getInfo(){
        return "Info: " + name + " " + age;
    }
}
