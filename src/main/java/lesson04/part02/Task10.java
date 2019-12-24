package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 * 3. Выведи результат на экран, каждое значение с новой строки.
 *
 * Требования:
 * 1.	Проинициализируй переменную типа список строк.
 * 2.	Считай 10 строк с клавиатуры и добавь их в список.
 * 3.	Метод doubleValues должен удваивать элементы списка
 * по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
 * 4.	Выведи получившийся список на экран, каждый элемент с новой строки.
 */

public class Task10 {
  public static void main(String[] args) throws Exception {
    // Считать строки с консоли и объявить ArrayList list тут
    int i;
    ArrayList<String> list = new ArrayList<>();
    Scanner in=new Scanner(System.in);
    for(i=0;i<10;i++) {
      list.add(in.nextLine());
    }

    ArrayList<String> result = doubleValues(list);

    // Вывести на экран result
    System.out.println(result);
  }

  public static ArrayList<String> doubleValues(ArrayList<String> list) {
    //напишите тут ваш код
    int i;
    for(i=0;i<20;i=i+2){
      list.add(i+1,list.get(i));
    }
    return list;
  }
}
