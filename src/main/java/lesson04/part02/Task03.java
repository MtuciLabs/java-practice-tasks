package lesson04.part02;

import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строк.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 *
 * Требования:
 * 1.	Программа не должна ничего считывать с клавиатуры.
 * 2.	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
 * 3.	Программа должна добавить 5 любых строк в список.
 * 4.	Программа должна вывести размер списка на экран.
 * 5.	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
 */

public class Task03 {

  public static void main(String[] args) {
    ArrayList aList = new ArrayList();
    aList.add("Кошка");
    aList.add("Собака");
    aList.add("Попугайчик");
    aList.add("Хомяк");
    aList.add("Черепашка");

    System.out.println(aList.size());

    int i;
    for (i=0; i<=aList.size()-1; i++){
      System.out.println(aList.get(i));
    }

  }
}
