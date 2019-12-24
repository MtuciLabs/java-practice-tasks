package lesson02.part02;

import java.io.*;
/**
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания. Выведенные числа должны быть разделены пробелом.
 *
 *
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить числа на экран.
 * 3.	Программа должна выводить три числа разделенных пробелами.
 * 4.	Программа должна выводить числа в порядке убывания.
*/

public class Task20 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        String number3 = bufferedReader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        if ((a > b) & (a > c)) {
            System.out.print(" " + a);
            if (b > c) {
                System.out.print(" " + b);
                System.out.print(" " + c);
            } else {
                System.out.print(" " + c);
                System.out.print(" " + b);
            }
        }
        else if ((b > a) & (b > c)) {
            System.out.print(" " + b);
            if (a > c) {
                System.out.print(" " + a);
                System.out.print(" " + c);
            } else {
                System.out.print(" " + c);
                System.out.print(" " + a);
            }
        }
        else if ((c > a) & (c > b)) {
            System.out.print(" " + c);
            if (a > b) {
                System.out.print(" " + a);
                System.out.print(" " + b);
            } else {
                System.out.print(" " + b);
                System.out.print(" " + a);
            }
        }
    }
}
