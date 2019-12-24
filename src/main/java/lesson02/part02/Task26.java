package lesson02.part02;

/**
 * Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
 * «отрицательное четное число» - если число отрицательное и четное,
 * «отрицательное нечетное число» - если число отрицательное и нечетное,
 * «ноль» - если число равно 0,
 * «положительное четное число» - если число положительное и четное,
 * «положительное нечетное число» - если число положительное и нечетное.
 * Пример для числа 100:
 * положительное четное число
 * Пример для числа -51:
 * отрицательное нечетное число
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать число c клавиатуры.
 * 2.	Программа должна использовать команду System.out.println() или System.out.print().
 * 3.	Если число отрицательное и четное, вывести "отрицательное четное число".
 * 4.	Если число отрицательное и нечетное, вывести "отрицательное нечетное число".
 * 5.	Если число равно 0, вывести "ноль".
 * 6.	Если число положительное и четное, вывести "положительное четное число".
 * 7.	Если число положительное и нечетное, вывести "положительное нечетное число".
 */

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

public class Task26 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();
        int a = Integer.parseInt(number);
        if ((a > 0) & (a % 2 == 0)) {
            System.out.println("Polozhitelnoe chetnoe chislo");
        }
        else if ((a > 0) & (a % 2 != 0)) {
            System.out.println("Polozhitelnoe nechetnoe chislo");
        }
        else if ((a < 0) & (a % 2 == 0)) {
            System.out.println("Otritsatelnoe chetnoe chislo");

        }
        else if ((a < 0) & (a % 2 != 0)) {
            System.out.println("Otritsatelnoe nechetnoe chislo");
        } else {
            System.out.println("nol");
        }
    }
}
