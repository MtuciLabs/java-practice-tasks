package lesson02.part02;

import java.util.Scanner;
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
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a>b+c || c>b+a || b>a+c){
            System.out.println("Треугольник не существует.");
        }else{
            System.out.println("Треугольник  существует.");
        }

    }
}