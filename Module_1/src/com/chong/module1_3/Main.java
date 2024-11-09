package com.chong.module1_3;

public class Main {
    public static void main(String[] args){
        Triangle triangle1 = new Triangle(5,10);
        Triangle triangle2 = new Triangle(5,10,14);

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(2);

        TwoDShape[] twoDShapes = {triangle1, circle1, triangle2, circle2};

        for (int i = 0; i < twoDShapes.length; i++) {
            System.out.println(twoDShapes[i].toString());
            System.out.print("Area = ");
            twoDShapes[i].getArea();
            System.out.println();
        }

    }
}
