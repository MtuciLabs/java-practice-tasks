package lesson04.part02;

import java.util.Set;
import java.util.HashSet;
/**
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 *
 * Требования:
 * 1.	Программа не должна выводить текст на экран.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Класс должен содержать только три метода.
 * 4.	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
 * 5.	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */

public class Task23 {

  public static Set<Integer> createSet() {
    Set<Integer> s=new HashSet<>();
    s.add(56);
    s.add(1);
    s.add(567);
    s.add(3);
    s.add(5);
    s.add(56);
    s.add(8);
    s.add(9);
    s.add(54);
    s.add(3);
    s.add(2);
    s.add(7);
    s.add(98);
    s.add(56);
    s.add(2);
    s.add(5);
    s.add(1);
    s.add(234);
    s.add(5);
    s.add(5);
    return s;
  }

  public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
    for(int i:set){
      if(i>10){
        set.remove(i);
      }

    }
    return set;
  }


  public static void main(String[] args) {

  }
}
