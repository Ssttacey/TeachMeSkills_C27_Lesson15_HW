package com.teachmeskills.lesson15.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter your numbers from 1 to 9. When your numbers is over, just write 'exit' to show the result ");
            ArrayList<Integer> numbers = new ArrayList<>();
            while (true) {
                String value = scanner.nextLine();
                if (value.matches("[0-9]")) {
                    int a = Integer.parseInt(value);
                    numbers.add(a);
                } else if (value.toLowerCase().contains("exit")) {
                    break;
                } else {
                    System.out.println("Wrong value! enter a number pls");

                }
            }
            for (int i = 0; i < numbers.size(); i++)
                if (numbers.get(i) % 2 == 0 & numbers.get(i) != 0) {
                    System.out.println("your even numbers is " + numbers.get(i));
                }

        } catch (NumberFormatException e) {
            System.out.println(" You do smth wrong! Wrong number! ");
        }
    }
}
