package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 *
 * Требования:
 * 1.	В методе main инициализируй существующее поле strings новым ArrayList<>
 * 2.	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings.
 * 3.	Программа должна выводить самую длинную строку на экран.
 * 4.	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них
 * с новой строки.
 */

public class Task04 {

  private static ArrayList<String> strings;

  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    Scanner in=new Scanner(System.in);
    ArrayList strings=new ArrayList();
    int i;
    String s=null;
    strings.add(in.nextLine());
    strings.add(in.nextLine());
    strings.add(in.nextLine());
    strings.add(in.nextLine());
    strings.add(in.nextLine());
    int max=strings.get(0).toString().length();
    for (i=1;i<5;i++) {
      if (max < strings.get(i).toString().length()) {
        max = strings.get(i).toString().length();
      }
    }
    for (i = 0; i < 5; i++) {
      if (max == strings.get(i).toString().length()) {
        System.out.println(strings.get(i));
      }

    }
  }
}
