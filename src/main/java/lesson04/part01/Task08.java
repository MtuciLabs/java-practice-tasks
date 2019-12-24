package lesson04.part01;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Нужно создать два списка - LinkedList и ArrayList.
 *
 * Требования:
 * 1.	Программа не должна выводить текст на экран.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Программа должна содержать только три метода.
 * 4.	Метод createArrayList() должен создавать и возвращать список ArrayList.
 * 5.	Метод createLinkedList() должен создавать и возвращать список LinkedList.
 */

public class Task08 {

  public static Object createArrayList() {
    ArrayList aList = new ArrayList();
    return aList;
  }

  public static Object createLinkedList() {
    LinkedList lList = new LinkedList();
    return lList;
  }

  public static void main(String[] args) {

  }
}
