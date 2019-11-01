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
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c =in.nextInt();
        if (a<b && a<c && b<c) System.out.printf("%d %d %d \n",c,b,a);
        if (a<b && a<c && b>c) System.out.printf("%d %d %d \n",b,c,a);
        if (a>b && a<c && b<c) System.out.printf("%d %d %d \n",c,a,b);
        if (a>b && a>c && b<c) System.out.printf("%d %d %d \n",a,c,b);
        if (a>b && a>c && b>c) System.out.printf("%d %d %d \n",a,b,c);
        if (a<b && a>c && b>c) System.out.printf("%d %d %d \n",c,b,a);
    }
}
