package lesson02.part02;
import java.util.Scanner;

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
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        int[] numbers = new int[]{ a, b, c };
        int some_number = numbers[0];
        int coincidence_counter = 0;
        int arrays_number = 0;
        for(int i = 1; i < 3; i++) {
            if (some_number != numbers[i]) {
                coincidence_counter += 1;
                arrays_number = i;
            }
        }
        if(coincidence_counter == 2){
            System.out.println(numbers[0]);
        }
        else{
            System.out.println(numbers[arrays_number]);
        }

    }
}
