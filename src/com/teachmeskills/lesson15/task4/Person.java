package com.teachmeskills.lesson15.task4;

/**
 * fields with personal data, the toString method is overridden, constructors are created
 */
public class Person {

    public String name;
    public String position;
    public String groupNumber;

    public Person(String name, String position, String groupNumber) {
        this.name = name;
        this.position = position;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
