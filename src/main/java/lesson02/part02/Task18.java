package lesson02.part02;

/**
 * Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них. Если два числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран минимальное из двух целых чисел.
 * 4.	Если два числа равны между собой, необходимо вывести любое.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task18 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a");
        System.out.println("Введите число b");
        String as = reader.readLine();
        String bs = reader.readLine();
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        if (a<b) {
            System.out.println(a);

        }if (b<a) {
            System.out.println(b);
        }if (a==b){
            System.out.println(a);
        }
        //напишите тут ваш код

    }
}