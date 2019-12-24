package lesson02.part02;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        int a = scanner.nextInt();
        System.out.println("b:");
        int b = scanner.nextInt();
        System.out.println("c:");
        int c = scanner.nextInt();
        if ((a>b)&(b>c))
            System.out.println(a+" "+b+" "+c);
        else if ((a>c)&(c>b))
            System.out.println(a+" "+c+" "+b);
        else if ((b>a)&(a>c))
            System.out.println(b+" "+a+" "+c);
        else if ((b>c)&(c>a))
            System.out.println(b+" "+c+" "+a);
        else if ((c>a)&(a>b))
            System.out.println(c+" "+a+" "+b);
        else
            System.out.println(c+" "+b+" "+a);
        //напишите тут ваш код

    }
}
