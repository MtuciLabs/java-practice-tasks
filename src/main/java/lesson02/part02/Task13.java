package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
 * «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
 * если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
 * Пример для номера 5:
 * пятница
 * Пример для номера 10:
 * такого дня недели не существует
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать число c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Если введено число от 1 до 7, необходимо вывести день недели.
 * 4.	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
 */

public class Task13 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        int A = Integer.parseInt(a);

        if (A==1) {
            System.out.println("Понедельник");
        }
        if (A==2) {
            System.out.println("Вторник");
        }
        if (A==3) {
            System.out.println("Среда");
        }
        if (A==4) {
            System.out.println("Четверг");
        }
        if (A==5) {
            System.out.println("Пятница");
        }
        if (A==6) {
            System.out.println("Суббота");
        }
        if (A==7) {
            System.out.println("Воскресенье");
        }
        if (A>7 & A<1) {
            System.out.println("Такого дня недели не существует");
        }

    }
}