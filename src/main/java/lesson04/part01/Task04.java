package lesson04.part01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

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
    ArrayList<String> mas= new ArrayList<String>();
    int i;
    for(i=0;i<5;i++) {
      String q = in.nextLine();
      mas.add(q);
    }
    for(i=0;i<13;i++) {
      mas.add(0,mas.remove(mas.size()-1));
    }
    for (String string : mas){
      System.out.println(string);
    } //напишите тут ваш код
  }
}
