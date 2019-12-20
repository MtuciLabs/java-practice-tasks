package lesson02.part02;

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

import java.io.*;
import java.util.*;

public class Task13 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer num;
        num=s.nextInt();
        if (num==1){
            System.out.println("Понедельник");
        }
        else if (num==2){
            System.out.println("Вторник");
        }
        else if (num==3){
            System.out.println("Среда");
        }
        else if (num==4){
            System.out.println("Четверг");
        }
        else if (num==5){
            System.out.println("Пятница");
        }
        else if (num==6){
            System.out.println("Суббота");
        }
        else if (num==7){
            System.out.println("Воскресенье");
        }
        else {
            System.out.println("Такого дня недели не существует");
        }

    }
}