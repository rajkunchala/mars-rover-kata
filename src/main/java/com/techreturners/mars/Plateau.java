package com.techreturners.mars;

public class Plateau {
    // initialized with upper x, y i.e. max size of grid 5,5
    // can contain many rovers at different points

    private int upperX;
    private int upperY;

    public int getUpperX() {
        return upperX;
    }

    public void setUpperX(int upperX) {
        this.upperX = upperX;
    }

    public int getUpperY() {
        return upperY;
    }

    public void setUpperY(int upperY) {
        this.upperY = upperY;
    }
}
