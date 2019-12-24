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
    ArrayList<String> list = new ArrayList<String>();
    Scanner scn = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      list.add(scn.next());
    }
    int max = 0;
    String maxs = null;
    for (int i = 0; i < 5; i++) {
      String st = list.get(i);
      if (max < (st.length())) {
        max = st.length();
        maxs = st;
      }
    }
    for(int i=0;i<5;i++){
      String st=list.get(i);
      if(max==st.length()){
        System.out.println(st);

      }
    }

  }
}