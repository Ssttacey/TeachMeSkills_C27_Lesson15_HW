package com.teachmeskills.lesson15.task2.figure;

import com.teachmeskills.lesson15.task2.model.Figure;

/*
class contains information about the circle
 */
public class Circle extends Figure {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}