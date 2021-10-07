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
        //get orientation after turning left
        String resultOrientation = rover.getPosition().getOrientation().toString();

        //ASSERT
        assertEquals("N",resultOrientation);
    }

}
