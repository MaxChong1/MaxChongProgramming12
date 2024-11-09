package com.chong.module1_4;

public class Circle extends TwoDShape {
    //fields for circle (in addition to fields for TwoDShape)
    public final double PI = Math.PI; //pi (3.14159265359...)

    private double radius;

    private Colour colour;

    //Circle constructor, requires radius and colour (public for tests)
    public Circle(double radius, Colour colour){
        this.radius = radius;
        this.colour = colour;
    }

    //getArea method, overrides abstract TwoDShape method. Outputs the area of a circle, pi(r^2)
    @Override
    public double getArea(){
        return (PI)*(radius*radius);
    }

    //getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Colour getColour(){
        return colour;
    }

    public void setColour(Colour colour){
        this.colour = colour;
    }

    //toString method
    public String toString(){
        //returns "Circle[Radius=x]
        return "Circle[Radius=" + radius + " Colour=" + colour.getColour() + "]";
    }


}
