package lesson02.part02;

import java.io.*;

/**
 * Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них. Если два числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран минимальное из двух целых чисел.
 * 4.	Если два числа равны между собой, необходимо вывести любое.
 */

public class Task18 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Vvedite 2 tselih chisla");
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int min = b;
        if (a < min) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}