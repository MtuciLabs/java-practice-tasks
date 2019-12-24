package lesson04.part02;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
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
    //напишите тут ваш код
    Map<String, Integer> map = new HashMap<>();
    map.put("Max",500);
    map.put("Misha",420);
    map.put("Egor",1000);
    map.put("Sergey",30);
    map.put("Marat",10);
    map.put("Nikita",50);
    map.put("Kostya",250);
    map.put("Andrey",1040);
    map.put("Tom",140);
    map.put("Hank",680);
    return map;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    //напишите тут ваш код
    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()){
      Map.Entry<String, Integer> pair = iterator.next();
      String key = pair.getKey();
      int value = pair.getValue();
      if (value < 500)
        iterator.remove();
    }
  }

  public static void main(String[] args) {

  }
}
