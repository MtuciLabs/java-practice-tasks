package lesson01.part1;

import java.util.Scanner;

public class Task09 {

    /**
     * Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
     * <p>
     * Пример:
     * Метод sumDigitsInNumber вызывается с параметром 546.
     * <p>
     * Пример вывода:
     * 15
     * <p>
     * <p>
     * Требования:
     * 1. Программа не должна считывать данные с клавиатуры.
     * 2. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
     * 3. Метод sumDigitsInNumber должен возвращать значение типа int.
     * 4. Метод sumDigitsInNumber не должен ничего выводить на экран.
     * 5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
     * 6. Что будет если написать sout и нажать tab?
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(sumDigitsInNumber(number));
    }


    public static int sumDigitsInNumber(int number) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            int num1 = number % 10;
            number = (number - num1) / 10;
            sum += num1;
        }
        return sum;

    }
}
