package lesson03.part01;
import java.util.Scanner;

/**
 * Сделать класс ConsoleReader, у которого будут 4 статических метода:
 * String readString() - читает с клавиатуры строку
 * int readInt() - читает с клавиатуры число
 * double readDouble() - читает с клавиатуры дробное число
 * boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает
 * соответствующую логическую переменную true или false
 * <p>
 * Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner)
 * внутри каждого метода.
 * <p>
 * Требования:
 * 1.	Метод readString должен считывать и возвращать строку(тип String).
 * 2.	Метод readInt должен считывать и возвращать число(тип int).
 * 3.	Метод readDouble должен считывать и возвращать дробное число(тип double).
 * 4.	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).
 */

public class Task22 {

  public static void main(String[] args) throws Exception {

  }

  public static class ConsoleReader {

    public static String readString() throws Exception {
      //напишите тут ваш код
      Scanner scn = new Scanner(System.in);
      String stroka = scn.next();
      return stroka;
    }

    public static int readInt() throws Exception {
      //напишите тут ваш код
      Scanner scn = new Scanner(System.in);
      int chislo = scn.nextInt();
      return chislo;
    }

    public static double readDouble() throws Exception {
      //напишите тут ваш код
      Scanner scn = new Scanner(System.in);
      double drob = scn.nextDouble();
      return drob;
    }

    public static boolean readBoolean() throws Exception {
      //напишите тут ваш код
      Scanner scn = new Scanner(System.in);
      boolean logich = scn.nextBoolean();
      return logich;
    }
  }

}
