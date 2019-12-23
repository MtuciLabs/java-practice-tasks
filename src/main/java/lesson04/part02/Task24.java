package lesson04.part02;

import java.util.HashMap;
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
    HashMap <String, Integer> map = new HashMap<>(10);
    map.put("Иван", 1000);
    map.put("Людмила", 200);
    map.put("Егор", 3000);
    map.put("Елизавета", 500);
    map.put("Федор", 400);
    map.put("Арсений", 2001);
    map.put("Александр", 300);
    map.put("Инесса", 4000);
    map.put("Анастасия", 2050);
    map.put("Евгения", 400);
    return map;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    int i;
    for (i=0; i<=9; i++){
      if (map.get(i)>=500){
        map.remove(i);
      }
    }
  }

  public static void main(String[] args) {

  }
}
