package lesson02.part02;

/**
 * Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
 * «четное однозначное число» - если число четное и имеет одну цифру,
 * «нечетное однозначное число» - если число нечетное и имеет одну цифру,
 * «четное двузначное число» - если число четное и имеет две цифры,
 * «нечетное двузначное число» - если число нечетное и имеет две цифры,
 * «четное трехзначное число» - если число четное и имеет три цифры,
 * «нечетное трехзначное число» - если число нечетное и имеет три цифры.
 * Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
 * Пример для числа 100:
 * четное трехзначное число
 * Пример для числа 51:
 * нечетное двузначное число
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать одно число c клавиатуры.
 * 2.	Программа должна использовать команду System.out.println() или System.out.print().
 * 3.	Программа должна выводить только строку-описание числа и больше ничего.
 * 4.	Если число четное и имеет одну цифру, вывести "четное однозначное число".
 * 5.	Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
 * 6.	Если число четное и имеет две цифры, вывести "четное двузначное число".
 * 7.	Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
 * 8.	Если число четное и имеет три цифры, вывести "четное трехзначное число".
 * 9.	Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
 * 10.	Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
 */

import java.io.*;
import java.util.*;

public class Task27 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();
        int a = Integer.parseInt(number);
        if ((a>=1)&(a<=999))
            if ((a < 10) & (a % 2 == 0)) {
                System.out.println("Chetnoe odnoznachnoe chislo");
            }
            else if ((a < 10) & (a % 2 != 0)) {
                System.out.println("Nechetnoe odnoznachnoe chislo");
            }
            else if ((a >= 10) & (a < 100) & (a % 2 == 0)) {
                System.out.println("Chetnoe dvuznachnoe chislo");
            }
            else if ((a >= 10) & (a < 100) & (a % 2 != 0)) {
                System.out.println("Nechetnoe dvuznachnoe chislo");
            }
            else if ((a >= 100) & (a <= 999) & (a % 2 == 0)) {
                System.out.println("Chetnoe trehznachnoe chislo");
            } else {
                System.out.println("Nechetnoe trehznachnoe chislo");
            }

    }
}
