package com.chong.module1_1;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(){

    }
    TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

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

    public String toString(){
        //returns "TwoDShape[Width=x Height=y]"
        return "TwoDShape[Width=" + width + " Height=" + height + "]";
    }
}
