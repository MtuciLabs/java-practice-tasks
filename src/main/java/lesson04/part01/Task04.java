package lesson04.part01;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 строк с клавиатуры.
 * 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
 * 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 * <p>
 * Требования:
 * 1.	Объяви переменную типа список строк и сразу проинициализируй ee.
 * 2.	Программа должна считывать 5 строк с клавиатуры.
 * 3.	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * 4.	Программа должна выводить список на экран, каждое значение с новой строки.
 */

public class Task04 {

  public static void main(String[] args) throws Exception {
    Scanner in=new Scanner(System.in);

    ArrayList a1=new ArrayList();
    for(int i=0;i<5;i++){
      a1.add(i,in.next());
    }
    for(int i=0;i<13;i++){
      a1.add(0,a1.get(4));
      a1.remove(4);
    }
    for(int i=0;i<5;i++){
      System.out.println(a1.get(i));
    }
    //напишите тут ваш код
  }
}
