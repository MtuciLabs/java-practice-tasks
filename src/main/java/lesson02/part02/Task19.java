package lesson02.part02;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        int a= scanner.nextInt();
        System.out.println("Введите b:");
        int b= scanner.nextInt();
        System.out.println("Введите c:");
        int c= scanner.nextInt();
        System.out.println("Введите d:");
        int d= scanner.nextInt();
        int max1 = Math.max(a,b);
        int max2 = Math.max(c,d);
        int max = Math.max(max1,max2);
        if ((a==b)&(b==c)&(c==d)&(a==c)&(a==d)&(b==d))
            System.out.println(a);
        else
            System.out.println(max);
        //напишите тут ваш код

    }
}
