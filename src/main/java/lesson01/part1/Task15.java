package lesson01.part1;

import java.util.Scanner;

public class Task15 {

    /**
     * Выводим квадрат числа
     * Дана переменная number.
     * Напиши программу, которая выводит на экран квадрат этой переменной (number * number).
     * <p>
     * <p>
     * Требования:
     * 1. У переменной number можно менять только значение.
     * 2. Программа должна выводить текст.
     * 3. Выводимый текст должен быть числом.
     * 4. Выводимый текст должен быть квадратом переменной number.
     * 5. Вы слышали что-нибудь о классе Math?
     */


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(Math.pow(number, 2));
    }
}
