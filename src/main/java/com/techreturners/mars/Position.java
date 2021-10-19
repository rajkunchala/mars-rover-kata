package com.techreturners.mars;

public class Position {
    //the x,y co-ordinates of the Rover
    //orientation as an enum
    private int coordinateX;
    private int coordinateY;
    private Orientation orientation;

    public enum Orientation{
        N,
        E,
        S,
        W
    }

    Position(int coordinateX,int coordinateY,String orientation){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.orientation = Orientation.valueOf(orientation);

    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setOrientation(String orientation) {
        this.orientation = Orientation.valueOf(orientation);
    }

    @Override
    public String toString() {
        return coordinateX +" "+ coordinateY +" "+ orientation;
    }
}
