package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String [] array = new String[10];
    int i;
    for(i=0; i<=7; i++){
      array[i] = reader.readLine();
    }
    System.out.println(" ");
    for (i=0; i<=9; i++){
      System.out.println(array[i]);
    }
    System.out.println(" ");
    for (i=9; i>=0; i=i-1){
      System.out.println(array[i]);
    }
  }
}
