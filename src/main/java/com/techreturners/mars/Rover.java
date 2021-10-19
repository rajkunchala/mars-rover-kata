package com.techreturners.mars;

public class Rover {
    //has a position on the plateau
    //can receive a String of commands
    //behaviours
    //turnLeft , turnRight, Move
    private Position position;
    private String commands;

    public Rover() {
    }

    public Rover(int x, int y, String orientation) {
        position = new Position(x,y,orientation);
    }

    public Position getPosition() {
        return position;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public void startNavigation(){
        for (char command : getCommands().toCharArray()){
            if (command == 'L') {
                turnLeft();
            } else if (command == 'R'){
                turnRight();
            } else if (command == 'M'){
                moveForward();
            }
        }
    }
    private void turnLeft() {

        switch (position.getOrientation()) {
            case E:
                position.setOrientation("N");
                break;
            case N:
                position.setOrientation("W");
                break;
            case W:
                position.setOrientation("S");
                break;
            case S:
                position.setOrientation("E");
                break;
        }
    }

    private void turnRight() {
        switch (position.getOrientation()) {
            case E:
                position.setOrientation("S");
                break;
            case S:
                position.setOrientation("W");
                break;
            case W:
                position.setOrientation("N");
                break;
            case N:
                position.setOrientation("E");
                break;
        }
    }

    private void moveForward()  {
        switch (position.getOrientation()) {
            case N:
                position.setCoordinateY(position.getCoordinateY() + 1);
                break;
            case E:
                position.setCoordinateX(position.getCoordinateX() + 1);
                break;
            case S:
                position.setCoordinateY(position.getCoordinateY() - 1);
                break;
            case W:
                position.setCoordinateX(position.getCoordinateX() - 1);
                break;
        }
    }

}
