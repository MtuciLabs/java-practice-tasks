package lesson04.part01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    //напишите тут ваш код
    String[] array1 = new String[10];
    int[] array2 = new int[10];
    Scanner scanner = new Scanner(System.in);
    for (int i=0; i<array1.length; i++){
      array1[i]=scanner.nextLine();
    }
    for (int i=0; i<array2.length; i++){
      array2[i]=array1[i].length();
    }
    for (int i=0; i<array2.length; i++){
      System.out.print(array2[i]);
    }
  }
}
