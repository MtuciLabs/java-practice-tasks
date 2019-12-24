package lesson04.part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 *
 * Требования:
 * 1.	Создай массив целых чисел (int[]) на 20 элементов.
 * 2.	Считай с клавиатуры 20 целых чисел и добавь их в массив.
 * 3.	Найди и выведи через пробел максимальное и минимальное числа.
 * 4.	Используй цикл for.
 */

public class Task12 {
  public static void main(String[] args) throws IOException {
    Scanner in=new Scanner(System.in);
    ArrayList<Integer> a=new ArrayList<>();

    int maximum = 0;
    int minimum = 0;
    int i;
    for(i=0;i<20;i++) {
      a.add(in.nextInt());
    }
    maximum=a.get(0);
    minimum=a.get(0);
    for (i=1;i<20;i++) {
      if (a.get(i)>maximum){
        maximum=a.get(i);
      }
      if (a.get(i)<minimum){
        minimum=a.get(i);
      }
    }

    System.out.print(maximum + " " + minimum);
  }
}
