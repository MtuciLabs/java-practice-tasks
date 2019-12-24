package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
 * "количество дней в году: x", где х - 366 для високосного года, х - 365 для обычного года.
 * Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
 * 1) если год делится на 400 это високосный год;
 * 2) в оставшихся годах после этого, если год делится на 100, то это обычный год;
 * 3) в оставшихся годах после этого, если год делится на 4, то это високосный год;
 * 4) все оставшиеся года невисокосные.
 * Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
 * Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
 * Годы 2100, 2200 и 2300 — не високосные.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать число c клавиатуры.
 * 2.	Программа должна выводить текст на экран, согласно условию.
 * 3.	Если введенный год является високосным, необходимо вывести текст: "количество дней в году: 366".
 * 4.	Если введенный год не является високосным, необходимо вывести текст: "количество дней в году: 365".
 */


public class Task14 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Vvedite god");
        String number = bufferedReader.readLine();
        int a = Integer.parseInt(number);
        if ((a % 400 == 0) & (a % 4 == 0)) {
            System.out.println("Kolichestvo dnei v godu: 366");
        }
        else if ((a % 4 == 0) & (a % 100 != 0)) {
            System.out.println("Kolichestvo dnei v godu: 365");
        }
    }
}