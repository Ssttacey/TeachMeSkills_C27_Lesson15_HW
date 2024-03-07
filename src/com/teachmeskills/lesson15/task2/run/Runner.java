package com.teachmeskills.lesson15.task2.run;

import com.teachmeskills.lesson15.task2.figure.Circle;
import com.teachmeskills.lesson15.task2.figure.Rectangle;
import com.teachmeskills.lesson15.task2.figure.Triangle;
import com.teachmeskills.lesson15.task2.model.Figure;

import java.util.ArrayList;

/**
 *Class contains data about objects and loop that prints the result to the console
 */

public class Runner {
    public static void main(String[] args) {

        Circle circle = new Circle(49);
        Circle circle2 = new Circle(6);
        Triangle triangle = new Triangle(8, 5, 9, 4);
        Triangle triangle2 = new Triangle(2, 7, 9, 8);
        Rectangle rectangle = new Rectangle(8, 4, 8, 4);

        ArrayList<Figure> array = new ArrayList<>();
        array.add((circle));
        array.add((circle2));
        array.add((triangle));
        array.add((triangle2));
        array.add((rectangle));
        for (Figure figures : array) {
            System.out.println(" figure is " + figures.name + " its perimeter is " + figures.getPerimeter());
        }
    }
}