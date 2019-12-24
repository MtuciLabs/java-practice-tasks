package lesson02.part02;

/**
 * Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 * Пример для чисел 4 6 6:
 * 1
 * Пример для чисел 6 6 3:
 * 3
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна использовать команды System.out.println() или System.out.print().
 * 3.	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
 * 4.	Если все числа разные, ничего не выводить.
 */

import java.io.*;
import java.util.*;

public class Task24 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer num1, num2, num3;
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
        if ((num1 == num2)&& (num2 == num3)&& (num1 == num3)) {
            System.out.println(" ");
        }
        else if (num1 == num2) {
            System.out.println(3);
        }
        else if (num1 == num3) {
            System.out.println(2);
        }
        else if (num2 == num3) {
            System.out.println(1);
        }


    }
}
