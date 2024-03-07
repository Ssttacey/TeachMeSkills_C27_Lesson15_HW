package com.teachmeskills.lesson15.task4;

import java.util.Set;

import static com.teachmeskills.lesson15.task4.Creation.list;

/**
 * runner class to run the program
 */
public class Runner {
    public static void main(String[] args) {

        Set<Person> studentNames = list();

        for (Person str : studentNames) {
            System.out.println(str);
        }
    }
}
