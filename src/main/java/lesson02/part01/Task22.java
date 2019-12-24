package lesson02.part01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Ввести с клавиатуры число n.
 * Вывести на экран надпись «Я буду зарабатывать $n в час».
 * Пример:
 * Я буду зарабатывать $50 в час
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Программа должна считывать данные с клавиатуры.
 * 3.	Выведенный текст должен содержать введенное число n.
 * 4.	Выведенный тест должен полностью соответствовать заданию.
 */

public class Task22 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        System.out.println("Я буду зарабатывать $" + sum + " в час");
    }
}
