package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
 * Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
 * "Треугольник существует." - если треугольник с такими сторонами существует.
 * "Треугольник не существует." - если треугольник с такими сторонами не существует.
 * Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
 * Требуется сравнить каждую сторону с суммой двух других.
 * Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать три числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран согласно условия задачи.
 * 3.	Если треугольник с такими сторонами может существовать, необходимо вывести текст: "Треугольник существует."
 * 4.	Если треугольник с такими сторонами не может существовать, необходимо вывести текст: "Треугольник не существует."
 */

public class Task15 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a");
        System.out.println("Введите число b");
        System.out.println("Введите число c");
        String as = reader.readLine();
        String bs = reader.readLine();
        String cs = reader.readLine();
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        int c = Integer.parseInt(cs);
        if (((a+b)>c)&&((a+c)>b)&&((b+c)>a)) {
            System.out.println("Треугольник существует.");
        }else{
            System.out.println("Треугольник не существует.");
        }

    }
}