package lesson04.part02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
 * Удалить из словаря всех людей, у которых зарплата ниже 500.
 * <p>
 * Требования:
 * 1.	Программа не должна выводить текст на экран.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
 * 4.	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */

public class Task24 {

  public static Map<String, Integer> createMap() {
    Map<String,Integer> map = new HashMap<>();
    map.put("Masha",200);
    map.put("Lena", 400);
    map.put("Liza", 800);
    map.put("Marina", 40);
    map.put("Nikita", 470);
    map.put("Rosa", 700);
    map.put("Sasha", 500);
    map.put("Maxim", 1400);
    map.put("Mitya", 900);
    map.put("Egor", 3200);
    //напишите тут ваш код
    return map;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()){
      Map.Entry<String,Integer> pair = iterator.next();
      String key = pair.getKey();
      int value = pair.getValue();
      if (value<500)
        iterator.remove();
    }
    //напишите тут ваш код
  }

  public static void main(String[] args) {

  }
}
