package com.teachmeskills.lesson15.task2.figure;

import com.teachmeskills.lesson15.task2.model.Figure;

/*
class contains information about the triangle
 */
public class Triangle extends Figure {

    public int height;
    public int side1;
    public int side2;
    public int side3;

    public Triangle(int height, int side1, int side2, int side3) {
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.name = "Triangle";
    }

    @Override
    public double getPerimeter() {
        double perimeter = side2 + side1 + side3;
        return perimeter;
    }
}
