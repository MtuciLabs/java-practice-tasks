package lesson02.part02;

import java.io.*;

/**
 * Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
 * в следующем виде:
 * "количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
 * Примеры:
 * а) при вводе чисел
 * 2
 * 5
 * 6
 * получим вывод
 * количество отрицательных чисел: 0
 * количество положительных чисел: 3
 * <p>
 * б) при вводе чисел
 * -2
 * -5
 * 6
 * получим вывод
 * количество отрицательных чисел: 2
 * количество положительных чисел: 1
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить количество отрицательных чисел в исходном наборе.
 * 4.	Программа должна выводить количество положительных чисел в исходном наборе.
 * 5.	Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
 * 6.	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
 * 7.	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
 */


public class Task29 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        String number3 = bufferedReader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int k=0;
        int n=0;
        if (a<0)
            k=k+1;
        else if (a>0)
            n=n+1;
        if (b<0)
            k=k+1;
        else if (b>0)
            n=n+1;
        if (c<0)
            k=k+1;
        else if (c>0)
            n=n+1;
        System.out.println("Kolichestvo otritsatelnih chisel: " + k);
        System.out.println("Kolichestvo polozhitelnih chisel: " + n);

    }
}
