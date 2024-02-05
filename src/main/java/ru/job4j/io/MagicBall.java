package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я - провидец, задавай мне такой вопрос, чтобы я ответил - да или нет");
        Scanner input = new Scanner(System.in);
        int answerCode = new Random().nextInt(3);
        input.nextLine();
        if (answerCode == 0) {
            System.out.print("Нет");
        } else if (answerCode == 1) {
            System.out.println("Да");
        } else {
            System.out.println("Может быть...");
        }
    }
}
