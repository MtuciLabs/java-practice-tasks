package lesson04.part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ввести с клавиатуры 2 числа N и M.
 * Ввести N строк и заполнить ими список.
 * Переставить M первых строк в конец списка.
 * Вывести список на экран, каждое значение с новой строки.
 *
 * Примечание: запрещено создавать больше одного списка.
 *
 * Требования:
 * 1.	Объяви переменную типа список строк и сразу проинициализируй ee.
 * 2.	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
 * 3.	Переставить M первых строк в конец списка.
 * 4. Выведи список на экран, каждое значение с новой строки.
 */

public class Task11 {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    ArrayList<String> a = new ArrayList<String>();
    int i;
    for (i = 0; i < N; i++) {
      a.add(in.nextLine());
    }
    for (i = 0; i < M; i++) {
      a.add(N + i, a.get(i));
      a.remove(a.get(i));
    }
    for (i=0;i<N+M;i++){
      System.out.println(a.get(i));
    }
    //напишите тут ваш код
  }
}
