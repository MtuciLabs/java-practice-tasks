package lesson04.part02;

import java.util.HashMap;
import java.util.Map;

/**
 * Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
 * Вывести на экран список ключей, каждый элемент с новой строки.
 *
 * Требования:
 * 1.	Программа должна создавать переменную коллекции Map с типом элементов String, String. Переменная должна быть сразу проинициализирована.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
 * 4.	Метод printKeys() должен выводить на экран список ключей коллекции, каждый элемент с новой строки.
 */

public class Task18 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("AURUS", "AURUS");
    map.put("Tim", "Tim");
    map.put("Arabic", "Arabic");
    map.put("Andry", "Andry");
    map.put("Andrey", "Andrey");
    map.put("Any", "Any");
    map.put("Ann", "Ann");
    map.put("Fact", "Fact");
    map.put("Fasion", "Fasion");
    map.put("Ess", "Ess");

    printKeys(map);
  }

  public static void printKeys(Map<String, String> map) {
    for (Map.Entry<String, String> pair : map.entrySet()) {
      System.out.println(pair.getKey());
    } //напишите тут ваш код
  }
}
