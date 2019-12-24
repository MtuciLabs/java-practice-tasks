package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 * Пример: m=2, n=4
 * 8888
 * 8888
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать два числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить прямоугольник размером m на n из восьмёрок.
 * 4.	В программе должен использоваться цикл for.
 */

public class Task36 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer m = Integer.parseInt(reader.readLine());
        Integer n = Integer.parseInt(reader.readLine());
        for (int x = 0; x < m; x++){
            for (int y = 0; y < n; y++){
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
