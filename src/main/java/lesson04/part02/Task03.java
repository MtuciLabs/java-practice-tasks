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
    ArrayList<String> ar=new ArrayList<>();
    ar.add("1mcodnjksd");
    ar.add("2mcodnjksd");
    ar.add("3mcodnjksd");
    ar.add("4mcodnjksd");
    ar.add("5mcodnjksd");
    System.out.println(ar.size());
    for(int i=0;i<5;i++){
      System.out.println(ar.get(i));
    }
    //напишите тут ваш код
  }
}
