package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зелёный сигнал,
 * затем в течение одной минуты — жёлтый, а потом в течение одной минуты — красный, затем опять зелёный горит три минуты и т. д.
 * Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 * Определить, сигнал какого цвета горит для пешеходов в этот момент.
 * Результат вывести на экран в следующем виде:
 * "зелёный" - если горит зелёный цвет, "жёлтый" - если горит жёлтый цвет, "красный" - если горит красный цвет.
 * Пример для числа 2.5:
 * зелёный
 * Пример для числа 3:
 * жёлтый
 * Пример для числа 4:
 * красный
 * Пример для числа 5:
 * зелёный
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать вещественное число c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Если горит зелёный цвет, необходимо вывести текст: "зелёный"
 * 4.	Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
 * 5.	Если горит красный цвет, необходимо вывести текст: "красный"
 */

public class Task16 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Vvedie, skolko minut proshlo s nachala novogo chasa");
        String number = bufferedReader.readLine();
        Double t = Double.parseDouble(number);
        while (t>5) {
            t = t - 5;
        }
        if (t == 3) {
            System.out.println("Zheltiy");
        }
        else if (t == 4) {
            System.out.println("Krasniy");
        }
        else if (t == 5) {
            System.out.println("Zeleniy");
        }

    }
}