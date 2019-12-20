package lesson02.part02;

/**
 * Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
 * Если два числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран минимальное из двух целых чисел.
 * 4.	Если два числа равны между собой, необходимо вывести любое.
 */

import java.io.*;
import java.util.*;

public class Task18 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer num1, num2;
        num1=s.nextInt();
        num2=s.nextInt();
        if (num1 >= num2)
            System.out.println(num2);
        else
            System.out.println(num1);
    }
}