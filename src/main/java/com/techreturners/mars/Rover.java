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
        if (position.getOrientation().toString().equals("E")){
            position.setOrientation("N");
        }
        else if (position.getOrientation().toString().equals("N")){
            position.setOrientation("W");
        }
        else if (position.getOrientation().toString().equals("W")){
            position.setOrientation("S");
        }
        else if (position.getOrientation().toString().equals("S")){
            position.setOrientation("E");
        }
    }

    private void turnRight() {
        if (position.getOrientation().toString().equals("E")){
            position.setOrientation("S");
        }
        else if (position.getOrientation().toString().equals("S")){
            position.setOrientation("W");
        }
        else if (position.getOrientation().toString().equals("W")){
            position.setOrientation("N");
        }
        else if (position.getOrientation().toString().equals("N")){
            position.setOrientation("E");
        }
    }

    private void moveForward()  {
        if (position.getOrientation().toString().equals("N")){
            position.setCoordinateY(position.getCoordinateY()+1);
        }
        else if (position.getOrientation().toString().equals("E")){
            position.setCoordinateX(position.getCoordinateX()+1);
        }
        else if (position.getOrientation().toString().equals("S")){
            position.setCoordinateY(position.getCoordinateY()-1);
        }
        else if (position.getOrientation().toString().equals("W")){
            position.setCoordinateX(position.getCoordinateX()-1);
        }
    }

}
