package com.techreturners.mars.test;

import com.techreturners.mars.Plateau;
import com.techreturners.mars.Rover;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissionControlTest {

    //
    @Test
    public void checkSetupOfPlateauWithCoordinatesMoreThanLimit() throws Exception {
        //Arrange
        Plateau plateau;
        String exception = null;
        //ACT
        try {
            plateau = new Plateau(6,6);
        }
        catch (Exception e) {
            exception = e.getMessage();
        }
        //ASSERT
        assertEquals("Invalid coordinates for setup of plateau", exception);

    }

    @Test
    public void checkRoverInitAndVerifyThePosition(){
        //ARRANGE
        Rover rover  = new Rover(1,2,"N");
        //ACT
        String actualOrientation = rover.getPosition().getOrientation().toString();
        int actualX = rover.getPosition().getCoordinateX();
        int actualY = rover.getPosition().getCoordinateY();
        //ASSERT
        assertEquals("N",actualOrientation);
        assertEquals(1,actualX);
        assertEquals(2,actualY);
    }

    //test implement Rover behaviours

    @Test
    public void checkRoverTurnLeft(){
        //ARRANGE
        Rover rover = new Rover(2,3,"E");
        //ACT
        //turn left from E should change the orientation to N
        rover.turnLeft();
        //get orientation and coordinates after turning left
        String resultOrientation = rover.getPosition().getOrientation().toString();
        int actualX = rover.getPosition().getCoordinateX();
        int actualY = rover.getPosition().getCoordinateY();

        //ASSERT
        assertEquals("N",resultOrientation);
        assertEquals(2,actualX);
        assertEquals(3,actualY);
    }
    @Test
    public void checkRoverTurnRight(){
        //ARRANGE
        Rover rover = new Rover(4,2,"S");
        //ACT
        //turn right from S should change the orientation to W
        rover.turnRight();
        //get orientation and coordinates after turning right
        String resultOrientation = rover.getPosition().getOrientation().toString();
        int actualX = rover.getPosition().getCoordinateX();
        int actualY = rover.getPosition().getCoordinateY();
        //ASSERT
        assertEquals("W",resultOrientation);
        assertEquals(4,actualX);
        assertEquals(2,actualY);
    }
    @Test
    public void checkRoverMoveForward(){
        //ARRANGE
        Rover rover = new Rover(2,3,"S");
        //ACT
        //move forward should change the Y to Y-1 and orientation remains S
        rover.moveForward();
        //get orientation and coordinates after moving forward
        String resultOrientation = rover.getPosition().getOrientation().toString();
        int actualX = rover.getPosition().getCoordinateX();
        int actualY = rover.getPosition().getCoordinateY();
        //ASSERT
        assertEquals("S",resultOrientation);
        assertEquals(2,actualX);
        assertEquals(2,actualY);
    }
}
