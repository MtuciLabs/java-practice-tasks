package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить среднее из трех чисел.
 * 4.	Если все числа равны, вывести любое из них.
 * 5.	Если два числа из трех равны, вывести любое из двух.
 */

public class Task41 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer num1, num2, num3;
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        if (((num2<num1)&(num1<num3))|((num3<num1)&(num1<num2))) {
            System.out.println(num1);
        }
        else if (((num2<num3)&(num3<num1)|(num1<num3)&(num3<num2))) {
            System.out.println(num3);
        }
        else {
            System.out.println(num2);
        }

    }
}
