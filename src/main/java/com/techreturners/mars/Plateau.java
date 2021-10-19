package com.techreturners.mars;

public class Plateau {
    // initialized with upper x, y i.e. max size of grid 5,5
    // can contain many rovers

    public Plateau(int upperX, int upperY) throws Exception {

        if (upperX > 5 | upperY > 5) {
            throw new Exception("Invalid coordinates for setup of plateau");
        }
    }

}
