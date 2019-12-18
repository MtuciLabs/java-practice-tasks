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
    ArrayList<String> list = new ArrayList<String>();
    list.add("sasd");
    list.add("asd123");
    return list;
  }

  public static Object createLinkedList() {
    LinkedList<String> list1 = new LinkedList<String>();
    list1.add("werwer");
    list1.add("qwe123");
    return list1;
  }

  public static void main(String[] args) {
      System.out.println(createArrayList());
      createLinkedList();

  }
}
