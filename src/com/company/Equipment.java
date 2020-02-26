package com.company;

public class Equipment {
    private String uniform;
    private String footballBoots;
    private int size;

    public Equipment(String uniform, String footballBoots, int size) {
        this.uniform = uniform;
        this.footballBoots = footballBoots;
        this.size = size;
    }

    public String getUniform() {
        return uniform;
    }

    public String getFootballBoots() {
        return footballBoots;
    }

    public int getSize() {
        return size;
    }
}
