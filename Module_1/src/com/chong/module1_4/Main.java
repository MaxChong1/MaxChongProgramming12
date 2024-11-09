package com.chong.module1_4;

public class Main {
    public static void main(String[] args){
        //creates two triangles
        Triangle triangle1 = new Triangle(5,10, Colour.GREEN);
        Triangle triangle2 = new Triangle(5,10,14, Colour.NONE);

        //creates two circles
        Circle circle1 = new Circle(5, Colour.RED);
        Circle circle2 = new Circle(2, Colour.BLUE);

        //adds all four shapes into an array of TwoDShapes
        TwoDShape[] twoDShapes = {triangle1, circle1, triangle2, circle2};

        //rotating both triangles to display rotation method
        triangle1.rotate90();
        triangle2.rotate(45);

        //for loop to loop through array of TwoDShapes
        for (int i = 0; i < twoDShapes.length; i++) {
            //utilizing the toString method for the twoDShapes
            System.out.println(twoDShapes[i].toString());
            System.out.print("Area = ");
            System.out.println(twoDShapes[i].getArea()); //outputs area without System.out.println because of abstract method
            System.out.println();
        }

    }
}
