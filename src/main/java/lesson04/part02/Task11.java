package lesson04.part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Ввести с клавиатуры 2 числа N и M.
 * Ввести N строк и заполнить ими список.
 * Переставить M первых строк в конец списка.
 * Вывести список на экран, каждое значение с новой строки.
 *
 * Примечание: запрещено создавать больше одного списка.
 *
 * Требования:
 * 1.	Объяви переменную типа список строк и сразу проинициализируй ee.
 * 2.	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
 * 3.	Переставить M первых строк в конец списка.
 * 4. Выведи список на экран, каждое значение с новой строки.
 */

public class Task11 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    int m = Integer.parseInt(reader.readLine());

    ArrayList<String> aList = new ArrayList();

    int i;
    for (i=0; i<=n-1; i++){
      aList.add(reader.readLine());
    }
    for (i=0; i<=n-1; i++){
      aList.add(aList.get(0));
      aList.remove(0);
    }

    for (i=0; i<=m-1; i++){
      aList.add(aList.get(0));
      aList.remove(0);
    }

    for (i=0; i<=n-1; i++){
      System.out.println(aList.get(i));
    }

    //напишите тут ваш код
  }
}
