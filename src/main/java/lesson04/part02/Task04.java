package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList <String> aList = new ArrayList();
    int i;
    for (i=0; i<=4; i++){
      aList.add(reader.readLine());
    }
    int max = -1;
    for (i=0; i<=4; i++){
      if (aList.get(i).length()>max){
        max=aList.get(i).length();
      }
    }
    for (i=0; i<=4; i++){
      if (aList.get(i).length()==max){
        System.out.println(aList.get(i));
      }
    }
  }
}
