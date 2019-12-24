package lesson04.part01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 15 целых чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
 * Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой.
 * Выяснить, на какой стороне улицы проживает больше жителей.
 * 4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей."
 * или "В домах с четными номерами проживает больше жителей."
 * <p>
 * Примечание:
 * дом с порядковым номером 0 считать четным.
 * <p>
 * Требования:
 * 1.	Программа должна создавать массив на 15 целых чисел.
 * 2.	Программа должна считывать числа для массива с клавиатуры.
 * 3.	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.",
 * если сумма нечетных элементов массива больше суммы четных.
 * 4.	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.",
 * если сумма четных элементов массива больше суммы нечетных.
 */

public class Task03 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int [] array = new int[15];
    int i;
    int sChet = 0;
    int sNechet = 0;
    for(i=0;i<=14;i++){
      if (i % 2 == 0) {
        sChet = sChet + array[i];
      } else {
        sNechet = sNechet + array[i];
      }

    }
    if (sChet>sNechet){
      System.out.println("В домах с чётными номерами проживает больше жителей");
    } else {
      System.out.println("В домах с нечётными номерами проживает больше жителей");
    }
  }
}
