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
    Scanner in=new Scanner(System.in);
    int[] ar=new int[10];
    for(int i=0;i<10;i++){
      ar[i]=in.nextInt() ;
    }
    for(int i=9;i>=0;i--){
      System.out.println(ar[i]);
    }
    //напишите тут ваш код
  }
}
