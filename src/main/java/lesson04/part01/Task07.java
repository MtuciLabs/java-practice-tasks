package lesson04.part01;

import java.util.HashMap;
import java.util.Map;

/**
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
    map.put("Pit", "Pit");
    map.put("Tom", "Tom");
    map.put("Ash", "Ash");
    map.put("Baby", "Baby");
    map.put("Cat", "Cat");
    map.put("Dog", "Dog");
    map.put("Eat", "Eat");
    map.put("Food", "Food");
    map.put("Gev", "Gev");
    map.put("Mik", "Mik");

    printValues(map);
  }

  public static void printValues(Map<String, String> map) {
    System.out.println(map);
  }
}
