package lesson03.part01;

import java.io.IOException;

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
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task18 {

  public static int even;
  public static int odd;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(reader.readLine());
    while (x > 0) {
      if (x % 2 == 0) {
        even++;
      } else {
        odd++;
      }
      x /= 10;
    }
    System.out.println("Even: " + even + " Odd: " + odd);
  }
} //напишите тут ваш код


