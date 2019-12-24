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
    HashMap<String, Integer> map = new HashMap<>(10);
    map.put("Петров", 50234);
    map.put("Пупкин", 300);
    map.put("Сидоров", 242342);
    map.put("Макаров", 1);
    map.put("Григорьев", 23423);
    map.put("Алексеев", 32);
    map.put("Шишкин", 40000000);
    map.put("Ким", 14234234);
    map.put("Олегов", 423);
    map.put("Ямочкин", 501);
    return map;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    //напишите тут ваш код
    int i;
    for (i=0; i<=9; i++){
      if(map.get(i)>=500){
        map.remove(i);
      }
    }
  }

  public static void main(String[] args) {

  }
}
