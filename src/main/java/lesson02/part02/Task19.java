package lesson02.part02;
import java.io.*;

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
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Vvedite 4 chisla");
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        String number3 = bufferedReader.readLine();
        String number4 = bufferedReader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int d = Integer.parseInt(number4);
        int max = a;
        if ((b > max)&(b>=c)&(b>=d)) {
            System.out.println(b);

        }
        else if ((c>max)&(c>=d)) {
            System.out.println(c);
        }
        else if (d > max) {
            System.out.println(d);
        } else {
            System.out.println(a);
        }
    }
}
