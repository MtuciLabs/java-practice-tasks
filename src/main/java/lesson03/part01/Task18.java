package lesson03.part01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
 * Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
 * Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
 * Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
 * Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
 * <p>
 * Пример для числа 4445:
 * Even: 3 Odd: 1
 * <p>
 * Требования:
 * 1.	Программа должна считывать данные с клавиатуры.
 * 2.	Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
 * 3.	Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
 * 4.	Программа должна выводить текст на экран.
 * 5.	Выведенный текст должен соответствовать заданию.
 */

public class Task18 {

  public static int even=0;
  public static int odd=0;

  public static void main(String[] args) throws IOException {
    Scanner scan1 = new Scanner(System.in);
    int chislo=scan1.nextInt();
    while(chislo != 0){
      int ch=chislo % 10;
      if (ch%2==0){
        even+=1;
      } else {
        odd+=1;
      }
      chislo=chislo/10;
    }
  System.out.println("Even: "+ even + " Odd: "+ odd);
  }
}
