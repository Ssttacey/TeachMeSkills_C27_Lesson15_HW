package com.teachmeskills.lesson15.task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
    try {

        int sum = 0;
        int average = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter collection size  ");
            int value = scanner.nextInt();
            scanner.close();
        ArrayList<Integer> numb = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            numb.add((int) (Math.random() * 11));
            }

        for(int i = 0; i <numb.size(); i ++) {
            sum = sum + numb.get(i);
        }
            average = sum / numb.size();
            System.out.println(average);

    } catch (IllegalArgumentException | ArithmeticException e) {
        System.out.println(" You do smth wrong! Wrong number! ");
    } catch (InputMismatchException exception) {
        System.out.println(" Wrong symbols. Only numbers! ");
    }
}
}
