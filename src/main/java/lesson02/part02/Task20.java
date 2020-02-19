package lesson02.part02;

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
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task20 {
    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число a");
            System.out.println("Введите число b");
            System.out.println("Введите число c");
            String as = reader.readLine();
            String bs = reader.readLine();
            String cs = reader.readLine();
            int a = Integer.parseInt(as);
            int b = Integer.parseInt(bs);
            int c = Integer.parseInt(cs);
            int max = 0;
            int sr = 0;
            int min = 0;
            if (a > b && a > c) {
                max = a;
            } else if (b > c && b > a) {
                max = b;
            } else {
                max = c;
            }
            if (a < b && a < c) {
                min = a;
            } else if (b < c && b < a) {
                min = b;
            } else {
                min = c;
            }

            if (a!=max&&a!=min){
                sr=a;
            }else if (b!=max&&b!=min){
                sr=b;
            }else{
                sr=c;
            }

            System.out.println(min + " " + sr + " " + max);
        }  //напишите тут ваш код


}
