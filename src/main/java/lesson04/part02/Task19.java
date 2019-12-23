package lesson04.part02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * Sim - 5
 *
 * Требования:
 * 1.	Программа должна создавать переменную коллекции Map с типом элементов String, Object.
 * Переменная должна быть сразу проинициализирована.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Программа должна добавлять в коллекцию 10 различных объектов, согласно условию.
 * 4.	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
 */

public class Task19 {

  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<>();
    map.put("Som", 5);
    map.put("Tim", 5.5);
    map.put("Ara", false);
    map.put("Baby", null);
    map.put("Cat", "Cat");
    map.put("Eat", Long.valueOf(56));
    map.put("Food", Character.valueOf('3'));
    map.put("Gery", '6');
    map.put("Hugo", 111111111111L);
    map.put("Com", (double) 123);

    Set<Map.Entry<String,Object>> set=map.entrySet();
    for (Map.Entry<String,Object> m:set){
      System.out.print(m.getKey() + "-");
      System.out.println(m.getValue());
    }

  }
}
