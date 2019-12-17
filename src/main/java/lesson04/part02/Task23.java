package lesson04.part02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
    HashSet<Integer> set = new HashSet(20);
    int i;
    for (i=0; i<=19; i++){
      set.add(i);
    }
    return set;
  }

  public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
    Iterator<Integer> i = set.iterator();
    if (i.next()>=10){
      set.remove(i.next());
    }
    return set;
  }

  public static void main(String[] args) {

  }
}
