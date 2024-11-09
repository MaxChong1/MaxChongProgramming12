package com.chong.module1_4;

public abstract class TwoDShape {
    //fields for TwoDShape
    private double width;
    private double height;

    private Colour colour;

    //empty TwoDShape constructor
    TwoDShape(){

    }
    //TwoDShape constructor, requires a width, height, and colour
    TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    //abstract getArea method to get the area of different shapes
    public abstract double getArea();

    //getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    //toString method
    public String toString(){
        //returns "TwoDShape[Width=x Height=y]"
        return "TwoDShape[Width=" + width + " Height=" + height + " Colour=" + colour.getColour() + "]";
    }
}
