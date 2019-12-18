package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 * <p>
 * Требования:
 * 1.	Программа должна создавать массив на 10 целых чисел.
 * 2.	Программа должна считывать числа для массива с клавиатуры.
 * 3.	Программа должна выводить 10 строчек, каждую с новой строки.
 * 4.	Массив должен быть выведен на экран в обратном порядке.
 */

public class Task02 {

  public static void main(String[] args) throws Exception {
    int arrI[] = new int[10];
    Scanner scn = new Scanner(System.in);
    for (int i=0;i<10;i++){
      arrI[i]=scn.nextInt();
    }
    for(int j=9 ; j>=0; j--){
      System.out.println(arrI[j]);
    }
  }
}
