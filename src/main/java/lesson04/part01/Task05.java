package lesson04.part01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Вывести их в обратном порядке. Каждый элемент - с новой строки.
 * Использовать только цикл for.
 *
 * Подсказка:
 * Не забудь импортировать класс: java.util.ArrayList;
 *
 * Требования:
 * 1.	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
 * 2.	Считай 10 целых чисел с клавиатуры и добавь их в список.
 * 3.	Выведи числа в обратном порядке.
 * 4.	Используй цикл for.
 */

public class Task05 {
  public static void main(String[] args) throws IOException {
    int i;
    Scanner in=new Scanner(System.in);
    ArrayList<String> mas= new ArrayList<String>();
    for(i=0;i<10;i++){
      String q=in.nextLine();
      mas.add(q);
    }
    Collections.reverse(mas);
    System.out.println(mas);

    //напишите тут ваш код
  }
}
