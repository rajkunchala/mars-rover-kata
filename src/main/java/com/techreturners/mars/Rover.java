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

    public void setPosition(Position pos) {
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
        if (this.position.getOrientation().toString() == "E"){
            this.position.setOrientation("N");
        }
        else if (this.position.getOrientation().toString() == "N"){
            this.position.setOrientation("W");
        }
        else if (this.position.getOrientation().toString() == "W"){
            this.position.setOrientation("S");
        }
        else if (this.position.getOrientation().toString() == "S"){
            this.position.setOrientation("E");
        }
    }

    private void turnRight() {
        if (this.position.getOrientation().toString() == "E"){
            this.position.setOrientation("S");
        }
        else if (this.position.getOrientation().toString() == "S"){
            this.position.setOrientation("W");
        }
        else if (this.position.getOrientation().toString() == "W"){
            this.position.setOrientation("N");
        }
        else if (this.position.getOrientation().toString() == "N"){
            this.position.setOrientation("E");
        }
    }

    private void moveForward() {
        if (this.position.getOrientation().toString() == "N"){
            this.position.setCoordinateY(position.getCoordinateY()+1);
        }
        else if (this.position.getOrientation().toString() == "E"){
            this.position.setCoordinateX(position.getCoordinateX()+1);
        }
        else if (this.position.getOrientation().toString() == "S"){
            this.position.setCoordinateY(position.getCoordinateY()-1);
        }
        else if (this.position.getOrientation().toString() == "W"){
            this.position.setCoordinateX(position.getCoordinateX()-1);
        }
    }

}
