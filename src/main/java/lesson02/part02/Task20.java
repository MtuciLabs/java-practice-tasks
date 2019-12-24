package lesson02.part02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания. Выведенные числа должны быть разделены пробелом.
 *
 *
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить числа на экран.
 * 3.	Программа должна выводить три числа разделенных пробелами.
 * 4.	Программа должна выводить числа в порядке убывания.
*/

public class Task20 {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Введите первое число");
      String a = reader.readLine();
      int A = Integer.parseInt(a);

      System.out.println("Введите второе число");
      String b = reader.readLine();
      int B = Integer.parseInt(b);

      System.out.println("Введите второе число");
      String c = reader.readLine();
      int C = Integer.parseInt(c);

      int max1 = Math.max(A,B);
      int max2 = Math.max(B,C);
      int max = Math.max(max1,max2);

      int min1 = Math.min(A,B);
      int min2 = Math.min(B,C);
      int min = Math.min(min1,min2);

      if ((A!=min) && (A!=max)) {
        System.out.println(max + " " + A + " " + min);
      }
      else if ((B!=min) && (B!=max)) {
        System.out.println(max + " " + B + " " + min);
      }
      else
        System.out.println(max + " " + C + " " + min);

    }
}
