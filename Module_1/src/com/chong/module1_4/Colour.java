package com.chong.module1_4;

public enum Colour {
    RED("Red"), GREEN("Green"), BLUE("Blue"), NONE("None");

    //creates string outputs for the colours
    private final String COLOUR;

    Colour(String colour){
        this.COLOUR = colour;
    }

    //returns either "Red", "Green", "Blue", or "None"
    public String getColour(){
        return this.COLOUR;
    }


}
