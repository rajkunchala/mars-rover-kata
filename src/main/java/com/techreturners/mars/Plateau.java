package com.techreturners.mars;

public class Plateau {
    // initialized with upper x, y i.e. max size of grid 5,5
    // can contain many rovers

    private int upperX;
    private int upperY;
    private int lowerX;
    private int lowerY;

    public Plateau(int upperX, int upperY) throws Exception {

        if (upperX > 5 | upperY > 5) {
            throw new Exception("Invalid coordinates for setup of plateau");
        }
        this.upperX = upperX;
        this.upperY = upperY;
    }
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

    public int getLowerX() {
        return 0; //always zero
    }

    public void setLowerX(int lowerX) {
        this.lowerX = lowerX;
    }

    public int getLowerY() {
        return 0; //always zero
    }

    public void setLowerY(int lowerY) {
        this.lowerY = lowerY;
    }
}
