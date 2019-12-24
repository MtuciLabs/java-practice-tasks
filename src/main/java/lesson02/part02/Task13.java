package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
        //напишите тут ваш код
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();
        if(day==1){
            System.out.println("Понедельник");
        }
        if(day==2){
            System.out.println("Вторник");
        }
        if(day==3){
            System.out.println("Среда");
        }
        if(day==4){
            System.out.println("Четверг");
        }
        if(day==5){
            System.out.println("Пятница");
        }
        if(day==6){
            System.out.println("Суббота");
        }
        if(day==7){
            System.out.println("Воскресенье");
        }
        if (day>7 || day<1){
            System.out.println("такого дня недели не существует");
        }
    }
}