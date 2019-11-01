package lesson02.part02;

import java.util.Scanner;

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
        Scanner in= new Scanner(System.in);
        int a =in.nextInt();
        switch (a) {
            case 1: System.out.println("понедельник");
            case 2: System.out.println("вторник");
            case 3: System.out.println("среда");
            case 4: System.out.println("четверг");
            case 5: System.out.println("пятница");
            case 6: System.out.println("суббота");
            case 7: System.out.println("воскресенье");
            default: System.out.println("такого дня не существует");

        }
    }
}