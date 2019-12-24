package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * 1. Создать массив на 10 строк.
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
 * Каждый элемент - с новой строки.
 *
 * Требования:
 * 1.	Программа должна создавать массив на 10 строк.
 * 2.	Программа должна считывать 8 строк для массива с клавиатуры.
 * 3.	Программа должна выводить на экран 10 строк, каждую с новой строки.
 * 4.	Программа должна выводить на экран массив (10 элементов) в обратном порядке.
 */

public class Task01 {

  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    String[] a=new String[10];
    int i;
    Scanner in=new Scanner(System.in);
    for (i=0;i<10;i++){
      a[i]=in.nextLine();
    }
    for (i=9;i>=0;i--){
      System.out.println(a[i]);
    }
  }
}
