package lesson02.part02;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Ввести с клавиатуры строку name.
 * Ввести с клавиатуры дату рождения (три числа): y, m, d.
 * Вывести на экран текст:
 * «Меня зовут name.
 * Я родился d.m.y»
 * <p>
 * Пример вывода:
 * Меня зовут Вася.
 * Я родился 15.2.1988
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать строки c клавиатуры.
 * 2.	Программа должна выводить строки на экран.
 * 3.	Программа должна выводить текст, шаблон которого указан в задании.
 * 4.	Каждое предложение вывести с новой строки.
 */

public class Task43 {
    public static void main(String[] args) throws Exception {
        Calendar dater=new GregorianCalendar();
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        String dateString = in.nextLine();
        SimpleDateFormat dateForm=new SimpleDateFormat("dd.MM.yyyy");
        dater.setTime(dateForm.parse(dateString));
        System.out.println("Меня зовут "+name);
        System.out.println("Я родился " +dater.getTime());

    }
}
