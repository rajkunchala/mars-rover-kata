package com.techreturners.mars;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MissionControl {
    // get the input using a reader
    // navigate rovers as per the instructions in the input
    // throw errors for invalid moves/input
    // display final position of the rover as output

    public static void main(String[] args) throws IOException {
        //set up reader, plateau and roverlist
        BufferedReader inputReader;
        Plateau plateau;
        List<Rover> roverList = new ArrayList<>();

        try{
            inputReader = new BufferedReader(new FileReader("src/main/resources/roverinstructions.txt"));

            String inputLine;
            int lineNumber = 0;
            Rover rover = null;

            String[] tokens;

            while ((inputLine = inputReader.readLine()) !=null){
                ++lineNumber;

                if (lineNumber == 1){
                    //line 1 is the plateau init
                    tokens = inputLine.split(" ");
                    plateau = new Plateau(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]));
                }
                if (lineNumber % 2 == 0){
                    //this line is for rover init
                    tokens = inputLine.split(" ");
                    rover  = new Rover(Integer.parseInt(tokens[0]),
                                            Integer.parseInt(tokens[1]),
                                            tokens[2]);

                } else {
                    //this line is for commands
                    //set the commands and add to rover list
                    if (rover !=null) {
                        rover.setCommands(inputLine);
                        roverList.add(rover);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //Now we have rover list
        //let us navigate them as per commands and print the output to file
        for (Rover rover : roverList ){
            rover.startNavigation();
        }
        writeRoversFinalPositionToFile(roverList);
    }

    private static void writeRoversFinalPositionToFile(List<Rover> roverList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));
        for(Rover rover : roverList){
            writer.write(rover.getPosition().toString());
            writer.newLine();
        }
        writer.close();
    }

}
