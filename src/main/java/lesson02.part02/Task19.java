package lesson02.part02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран максимальное из четырёх чисел.
 * 4.	Если максимальных чисел несколько, необходимо вывести любое из них.
 */

public class Task19 {
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

        System.out.println("Введите второе число");
        String d = reader.readLine();
        int D = Integer.parseInt(d);

        int max1 = Math.max (A,B);
        int max2 = Math.max (C,D);
        int max = Math.max(max1,max2);

        System.out.println(max);
    }
}