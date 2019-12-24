package lesson04.part01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 *
 * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 *
 * Требования:
 * 1.	Программа должна создавать массив на 10 строк.
 * 2.	Программа должна создавать массив на 10 целых чисел.
 * 3.	Программа должна считывать строки для массива с клавиатуры.
 * 4. Программа должна в массив чисел записать длины строк из массива строк,
 * а затем их вывести на экран.
 */

public class Task02 {

  public static void main(String[] args) throws Exception {
    String[] arrS=new String[10];
    int[] arrI=new int[10];
    Scanner scn=new Scanner(System.in);
    for (int i=0;i<10; i++){
      arrS[i]=scn.next();
      arrI[i]=arrS[i].length();
    }
    System.out.println(Arrays.toString(arrI));
  }
}
