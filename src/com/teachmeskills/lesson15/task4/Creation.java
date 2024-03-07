package com.teachmeskills.lesson15.task4;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * objects and collection are created
 */
public class Creation {
    public static Set<Person> list() {

        Set<Person> studentNames = new LinkedHashSet<>();

        Person teacher = new Person("Andrew", "Teacher", "C-27");
        Person student1 = new Person("Alex", "Student", "C-27");
        Person student2 = new Person("Nikita", "Student", "C-27");
        Person student3 = new Person("Oleg", "Student", "C-27");
        Person student4 = new Person("Alina", "Student", "C-27");
        Person student5 = new Person("Ivan", "Student", "C-27");
        Person student6 = new Person("Pavel", "Student", "C-27");

        studentNames.add(teacher);
        studentNames.add(student1);
        studentNames.add(student2);
        studentNames.add(student3);
        studentNames.add(student4);
        studentNames.add(student5);
        studentNames.add(student6);
        return studentNames;
    }
}

