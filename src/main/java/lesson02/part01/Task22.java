package lesson02.part01;

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
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task22 {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: \n");
        String num = consoleReader.readLine();
        System.out.println("Я буду зарабатывать $"+ num + " в час");   //напишите тут ваш код
    }
}
