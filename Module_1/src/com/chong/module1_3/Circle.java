package com.chong.module1_3;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

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

    public String toString(){
        //returns "Circle[Radius=x]
        return "Circle[Radius=" + radius +"]";
    }



}
