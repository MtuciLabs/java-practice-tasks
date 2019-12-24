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
    Scanner scanner = new Scanner(System.in);
    System.out.println("N:");
    int N=scanner.nextInt();
    System.out.println("M:");
    int M=scanner.nextInt();
    ArrayList<String> list = new ArrayList<String>();
    System.out.println("Введите массив");
    for (int i =1; i<N; i++){
        list.add(scanner.nextLine());
    }
    for (int i=0; i<M; i++){
        list.add(list.get(0));
        list.remove(0);
    }
    for (int i=0;i<list.size(); i++){
        System.out.println(list.get(i));
    }

    //напишите тут ваш код
  }
}
