package lesson01.part1;

public class Task03 {

  /**
   * Мой юный друг
   * Сейчас 2019 год. Наш университет основан 98 лет назад.
   * Написать программу, выводящую на экран год основания МТУСИ.
   *
   * Требования:
   * 1. Программа должна выводить текст.
   * 2. Выведенный год должен состоять из 4 цифр.
   * 3. Выведенный год должен начинаться с "19".
   * 4. Выведенный год должен соответствовать заданию.
   */

  public static void main(String[] args) {
    int year = 2019;
    int age = 98;
    int gradDate = year-age;
    String graduationDate = Integer.toString (gradDate);
    System.out.println(graduationDate);
    // Напишите здесь ваш код
  }
}
