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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in ));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int a1 = Integer.parseInt(a);
        int a2 = Integer.parseInt(b);
        int a3 = Integer.parseInt(c);

        if (a1==a2 && a1!=a3)
            System.out.println("3");
        else if (a2==a3 && a2!=a1)
            System.out.println("1");
        else if (a1==a3 && a1!=a2);
        System.out.println("2");  //напишите тут ваш код

    }
}
