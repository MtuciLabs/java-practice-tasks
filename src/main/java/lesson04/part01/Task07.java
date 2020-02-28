package lesson04.part01;

import java.util.HashMap;
import java.util.Map;

/*
 * Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
 * Вывести на экран список значений, каждый элемент с новой строки.
 *
 * Требования:
 * 1.	Программа должна создавать переменную коллекции Map с типом элементов String, String. Переменная должна быть сразу проинициализирована.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
 * 4.	Метод printValues() должен выводить на экран список значений коллекции, каждый элемент с новой строки.
 */

public class Task07 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Som", "Som");
    map.put("Max", "Max");
    map.put("Marry", "Marry");
    map.put("Boby", "Boby");
    map.put("Maxim", "Maxim");
    map.put("Dolly", "Dolly");
    map.put("Bas", "Bas");
    map.put("Bad", "Bad");
    map.put("Book", "Book");
    map.put("Bully", "Bully");

    printValues(map);
  }

  public static void printValues(Map<String, String> map) {
    for (Map.Entry<String, String> pair : map.entrySet()) {
      String vol = pair.getValue();
      System.out.println(vol);
    } //напишите тут ваш код
  }
}
