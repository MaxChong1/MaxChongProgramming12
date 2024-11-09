package com.chong.module1_3;

public class Triangle extends TwoDShape implements rotate {
    private double side1;
    private double side2;
    private double side3;

    private double degrees;

    Triangle(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        //setting both the width and height for getArea method
        this.setWidth(side2); //setting the width as side2, so the getArea method has a width to work with (otherwise width is 0)
        this.setHeight(heronsHeight()); //setting height through heronsHeight method
    }

    @Override
    public double getArea(){
        //formula for area is (width*height/2)
        return (getWidth() * getHeight())/2;
    }

    private double heronsHeight(){
        //Heron's formula [sqrt(s(s-a)(s-b)(s-c))]
        //s = semi-perimeter
        //a = side1, b = side2, c = side3
        double halfPerimeter = (side1+side2+side3)/2;
        //gets area through herons formula
        double area =  Math.sqrt((halfPerimeter) * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));

        //returns height, formula is 2*(Area/base)
        return 2*(area/side2);
    }

    //getters and setters
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public String toString(){
        //returns "Triangle[Width=x Height=y]"
        return "Triangle[Width=" + getWidth() + " Height=" + getHeight() + " DegreesRotated=" + getDegrees() + "]";
    }


    @Override
    public void rotate90() {
        this.degrees = 90;
    }

    @Override
    public void rotate180() {
        this.degrees = 180;
    }

    @Override
    public void rotate(double degree) {
        this.degrees = degree;
    }
}
