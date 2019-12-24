package lesson04.part01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Вывести их в обратном порядке. Каждый элемент - с новой строки.
 * Использовать только цикл for.
 * <p>
 * Подсказка:
 * Не забудь импортировать класс: java.util.ArrayList;
 * <p>
 * Требования:
 * 1.	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
 * 2.	Считай 10 целых чисел с клавиатуры и добавь их в список.
 * 3.	Выведи числа в обратном порядке.
 * 4.	Используй цикл for.
 */

public class Task05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList array_list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число");
            array_list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = array_list.size() - 1; i >= 0; i--) {
            System.out.println(array_list.get(i));
        }
    }
}
