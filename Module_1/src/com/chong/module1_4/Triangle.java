package com.chong.module1_4;

public class Triangle extends TwoDShape implements rotate {
    //fields for Triangle (in addition to fields from TwoDShape;
    private double side1;
    private double side2;
    private double side3;

    private double degrees;
    private Colour colour;

    //constructor for Triangle, requires a width, height, and colour (public for tests)
    public Triangle(double width, double height, Colour colour){
        this.setWidth(width);
        this.setHeight(height);
        this.colour = colour;
    }

    //constructor for Triangle, requires 3 sides and a colour (public for tests)
    public Triangle(double side1, double side2, double side3, Colour colour){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colour = colour;

        //setting both the width and height for getArea method
        this.setWidth(side2); //setting the width as side2, so the getArea method has a width to work with (otherwise width is 0)
        this.setHeight(heronsHeight()); //setting height through heronsHeight method
    }

    //getArea method, overrides abstract TwoDShape method. Outputs the area of a triangle, (w*h)/2
    @Override
    public double getArea(){
        //formula for area is (width*height/2)
        return (getWidth() * getHeight())/2;
    }

    //method for determining height of triangle with heron's formula
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

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    //toString method
    public String toString(){
        //returns "Triangle[Width=x Height=y]"
        return "Triangle[Width=" + getWidth() + " Height=" + getHeight() + " Colour=" + colour.getColour() + " DegreesRotated=" + getDegrees() + "]";
    }

    //methods for rotation, affecting this.degrees. Overrides from rotate interface
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
