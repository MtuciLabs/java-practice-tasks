package lesson02.part02;

import java.io.*;
import java.util.*;

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
        Scanner s = new Scanner(System.in);
        Integer num1, num2, num3, num4;
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
        num4=s.nextInt();
        if (num1 <= num2)
            if (num3 <= num4)
                if (num2 <= num4)
                    System.out.println(num4);
                else System.out.println(num2);
            else if (num2 <= num3)
                System.out.println(num3);
            else System.out.println(num2);
        else if  (num3 <= num4)
            if (num1 <= num4)
                System.out.println(num4);
            else System.out.println(num1);
        else if (num1 <= num3)
            System.out.println(num3);
    }
}
