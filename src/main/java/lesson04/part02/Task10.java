package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 * 3. Выведи результат на экран, каждое значение с новой строки.
 *
 * Требования:
 * 1.	Проинициализируй переменную типа список строк.
 * 2.	Считай 10 строк с клавиатуры и добавь их в список.
 * 3.	Метод doubleValues должен удваивать элементы списка
 * по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
 * 4.	Выведи получившийся список на экран, каждый элемент с новой строки.
 */

public class Task10 {
  public static void main(String[] args) throws Exception {
    // Считать строки с консоли и объявить ArrayList list тут
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList aList = new ArrayList();
    ArrayList<String> list = null;

    ArrayList<String> result = doubleValues(list);
    int i;
    for(i=0; i<=0; i++){
      aList.add(reader.readLine());
    }

    // Вывести на экран result
    ArrayList<String> result = doubleValues(aList);

    for (i=0; i<=result.size()-1;i++){
      System.out.println(result.get(i));
    }
  }
}
