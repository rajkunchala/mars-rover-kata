package com.techreturners.mars;

public class Rover {
    //has a position on the plateau
    //can receive a String of commands
    //behaviours
    //turnLeft , turnRight, Move
    private int roverId;
    private Position position;
    private String commands;
    private int roverCount;

    public Rover() {
    }

    public Rover(int x, int y, String orientation) {
        this.position = new Position(x,y,orientation);
        this.roverId = ++roverCount;
    }

    public int getRoverId() {
        return roverId;
    }

    public void setRoverId(int roverId) {
        this.roverId = roverId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPos(Position pos) {
        this.position = pos;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public int getRoverCount() {
        return roverCount;
    }

    public void setRoverCount(int roverCount) {
        this.roverCount = roverCount;
    }
}
