package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

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
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Vvedite nomer dnya nedeli");
        String number = bufferedReader.readLine();
        int a = Integer.parseInt(number);
        if (a == 1) {
            System.out.println("Ponedelnik");
        }
        else if (a == 2) {
            System.out.println("Vtornik");
        }
        else if (a == 3) {
            System.out.println("Sreda");
        }
        else if (a == 4) {
            System.out.println("Chetverg");
        }
        else if (a == 5) {
            System.out.println("Pyatnitsa");
        }
        else if (a == 6) {
            System.out.println("Subbota");
        }
        else if (a == 7) {
            System.out.println("Voskresenie");
        } else {
            System.out.println("Takogo dnya nedeli ne sushestvuet");
        }


    }
}